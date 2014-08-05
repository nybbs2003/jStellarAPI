package jstellarapi.connection;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Arrays;

import javax.xml.bind.DatatypeConverter;

import jstellarapi.core.StellarAddress;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * This class should use only http POST/GET, not the websocket. For small operations,
 * (submit a TX), this could be faster than setting up a websocket connection. 
 *
 * @author pmarches
 */
public class StellarDaemonRPCConnection extends StellarDaemonConnection {
	protected URI stellarDaemonURI;
	public static URI STELLAR_RPC_URI=URI.create("http://test.stellar.org:9002");

	public StellarDaemonRPCConnection(URI StellarDaemonURI) throws Exception {
		this.stellarDaemonURI = StellarDaemonURI;
	}

	public StellarDaemonRPCConnection() throws Exception {
		this(StellarDaemonRPCConnection.STELLAR_RPC_URI);
	}

	public void submitTransaction(byte[] signedTransactionBytes) throws Exception {
		JSONObject txBlob = new JSONObject();
		txBlob.put("tx_blob", DatatypeConverter.printHexBinary(signedTransactionBytes));
		JSONObject command = createJSONCommand("submit", txBlob);
		JSONObject response = executeJSONCommand(command);
		
		JSONObject result = (JSONObject) response.get("result");
		if((Long) result.get("engine_result_code")!=0){
			System.err.println(response.toJSONString());
			throw new RuntimeException((String) result.get("engine_result_message"));
		}
	}
	
	protected JSONObject createJSONCommand(String commandName, JSONObject ... parameterObjects){
		JSONObject command = new JSONObject();
		command.put("method", commandName);
		JSONArray parameterArray = new JSONArray();
		command.put("params", parameterArray);
		parameterArray.addAll(Arrays.asList(parameterObjects));
		return command;
	}

	protected JSONObject executeJSONCommand(JSONObject command) throws Exception {
		String jsonString = command.toJSONString();

		HttpURLConnection connection = (HttpURLConnection) stellarDaemonURI.toURL().openConnection();
		connection.setUseCaches(false);
		connection.setRequestProperty("Content-Length", ""+jsonString.length());
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);

		OutputStream os = connection.getOutputStream();
		os.write(jsonString.getBytes());
		os.close();

		try {
			//TODO The response handling is probably common between the websocket and the RPC
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			JSONObject response = (JSONObject) new JSONParser().parse(rd);
			rd.close();
			return response;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public StellarAddressPublicInformation getPublicInformation(StellarAddress StellarAddress) throws Exception {
		JSONObject account=new JSONObject();
		account.put("account", StellarAddress.toString());
		JSONObject command = createJSONCommand("account_info", account);
		JSONObject response = executeJSONCommand(command);
		StellarAddressPublicInformation info = new StellarAddressPublicInformation();
		info.copyFrom((JSONObject) response.get("result"));
		return info;
	}

}