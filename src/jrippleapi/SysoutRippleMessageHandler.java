package jrippleapi;

import java.io.IOException;

import org.eclipse.jetty.websocket.api.annotations.OnWebSocketFrame;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.api.extensions.Frame;

@WebSocket
public class SysoutRippleMessageHandler extends AbstractRippleMessageHandler {

	public SysoutRippleMessageHandler() throws Exception {
		super();
	}

	synchronized public void sendString(String string) throws IOException{
		try {
			session.getRemote().sendString(string);
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@OnWebSocketMessage
	synchronized public void onMessage(String msg) {
    	System.out.print(msg);
		notifyAll();
    }
}
