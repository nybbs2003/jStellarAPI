package jstellarapi.serialization;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.nio.ByteBuffer;

import javax.xml.bind.DatatypeConverter;

import jstellarapi.core.DenominatedIssuedCurrency;
import jstellarapi.core.StellarAddress;
import jstellarapi.serialization.StellarBinarySerializer;

import org.junit.Test;

public class ReferenceImplementationAmountTests {
	StellarBinarySerializer ser = new StellarBinarySerializer();
	
//    @Test
//    public void testSerializing0STR() throws Exception {
//    	DenominatedIssuedCurrency amt = new DenominatedIssuedCurrency(BigDecimal.ZERO);
//        String s = ser.writeAmount(null, amt);
//        assertEquals("4000000000000000", s);
//        assertEquals(Amount.cPosNative.toString(16), s);
//    }
//
    @Test
    public void testSerializingNegativeIOU() throws Exception {
//        DenominatedIssuedCurrency amount = new DenominatedIssuedCurrency("-99.2643419677474", StellarAddress.Stellar_ADDRESS_NEUTRAL, "USD");
//
//        assertEquals(13, amount.amount.scale());
//        assertTrue(amount.isNegative());
//        assertFalse(amount.isNative());
//        assertEquals("-99.2643419677474/USD/rrrrrrrrrrrrrrrrrrrrBZbvji", amount.toString());


    	//		ByteBuffer output=ByteBuffer.allocate(48);
//		ser.writeAmount(output, amount);
//		String hex = DatatypeConverter.printHexBinary(output.array());
//        String expectedHex = "94E3440A102F5F5400000000000000000000000055534400000000000000000000000000000000000000000000000001";
//        assertEquals(expectedHex, hex);
    }

//
//    @Test
//    public void testSTRIOULegacySupport() throws Exception {
//        String json =  "{\n" +
//                        "  \"currency\": \"0000000000000000000000005852500000000000\",\n" +
//                        "  \"issuer\": \"rrrrrrrrrrrrrrrrrrrrBZbvji\",\n" +
//                        "  \"value\": \"0\"\n" +
//                        "}";
//
//        Amount amount = ser.fromJSONObject(new JSONObject(json));
//        assertEquals("STR", amount.currencyString());
//        assertFalse(amount.isNative);
//
//        JSONObject jsonObject = ser.toJSONObject(amount);
//        Amount rebuilt = ser.fromJSONObject(jsonObject);
//        assertEquals(amount, rebuilt);
//
//        byte[] a1bytes = ser.toWireBytes(amount);
//        byte[] a2bytes = ser.toWireBytes(rebuilt);
//
//        boolean equals = Arrays.equals(a1bytes, a2bytes);
//        assertTrue(equals);
//
//
//        String legacy = "{\n" +
//                "    \"currency\": \"0000000000000000000000005852500000000000\",\n" +
//                "    \"issuer\": \"rrrrrrrrrrrrrrrrrrrrBZbvji\",\n" +
//                                 //rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh
//                "    \"value\": \"0\"\n" +
//                "  }\n" +
//                "  \n" +
//                "";
//        String expected_hex = "800000000000000000000000000000000000000058525000000000000000000000000000000000000000000000000001";
//
//        Amount legacyAmount = ser.fromJSONObject(new JSONObject(legacy));
//        assertEquals(expected_hex, ser.toWireHex(legacyAmount));
//
//    }
//
//    @Test
//    public void test_Decimal_Parsing() {
//        assertEquals(0, amt("1.0").compareTo(amt("1000000")));
//        assertEquals(0, amt("1").compareTo(amt("0.000001")));
//    }
//
//    // TODO: use a more specific Exception class
//    @Test(expected = RuntimeException.class)
//    public void tests_Mother_Fucker_Do_You_Write_Them() {
//        amt("-0.0001621621623423423234234234");
//    }
//
//    @Test
//    public void test_Scale_Assumption() {
//        assertScale("1.0",   0);
//        assertScale("1.000", 0);
//        assertScale("1", 0);
//    }
//
//    private void assertScale(String s, int i) {
//        BigDecimal bd = new BigDecimal(s);
//        bd = bd.stripTrailingZeros();
//        assertEquals(bd.scale(), i);
//    }
//
//    @Test
//    public void test_Decimal_Equality() {
//        /*This is something to watch log for! Must delegate to compareTo() !*/
//        assertFalse(decimal("1.0").equals(decimal("1.00")));
//    }
//
//    private BigDecimal decimal(String s) {
//        return new BigDecimal(s);
//    }
//
    @Test
    public void test_Offset() {
        assertOffset(".9999999999999999",  -16);
        assertOffset("9.999999999999999",  -15);
        assertOffset("99.99999999999999",  -14);
        assertOffset("999.9999999999999",  -13);
        assertOffset("9999.999999999999",  -12);
        assertOffset("99999.99999999999",  -11);
        assertOffset("999999.9999999999",  -10);
        assertOffset("9999999.999999999",  -9);
        assertOffset("99999999.99999999",  -8);
        assertOffset("999999999.9999999",  -7);
        assertOffset("9999999999.999999",  -6);
        assertOffset("99999999999.99999",  -5);
        assertOffset("999999999999.9999",  -4);
        assertOffset("9999999999999.999",  -3);
        assertOffset("99999999999999.99",  -2);
        assertOffset("999999999999999.9",  -1);

//        assertOffset(".9",                 -16 );
//
//        assertOffset("9",                  -15 );
//        assertOffset("99",                 -14 );
//        assertOffset("999",                -13 );
//        assertOffset("9999",               -12 );
//        assertOffset("99999",              -11 );
//        assertOffset("999999",             -10 );
//        assertOffset("9999999",            -9 );
//        assertOffset("99999999",           -8 );
//        assertOffset("999999999",          -7 );
//        assertOffset("9999999999",         -6 );
//        assertOffset("99999999999",        -5 );
//        assertOffset("999999999999",       -4 );
//        assertOffset("9999999999999",      -3 );
//        assertOffset("99999999999999",     -2 );
//        assertOffset("999999999999999",    -1 );
//        assertOffset("9999999999999999",    0 );

    }

    private void assertOffset(String s, int i) {
//        DenominatedIssuedCurrency amt = new DenominatedIssuedCurrency(s, StellarAddress.Stellar_ADDRESS_NEUTRAL, "USD");
//        assertEquals(String.format("Offset for %s should be %d", s, i),  i, -amt.amount.scale());
    }

//    public Amount a50 = amt("50/USD/root"); // on the fly, cached, `passphrase to address`
//    public Amount b20 = amt("20/USD");
//    public Amount c5  = amt("5/USD");
//
//    @Test
//    public void test_Division() {
//        Amount d = a50.divide(b20).multiply(c5);
//        assertEquals("50/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", a50.stringRepr());
//        assertEquals("12.5/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", d.stringRepr());
//    }
//
//    @Test
//    public void test_Addition() {
//        Amount d = a50.add(b20).add(c5);
//        assertEquals("75/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", d.stringRepr());
//        assertEquals("80/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", d.add(new BigInteger("5")).stringRepr());
//        assertEquals("80/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", d.add(5).stringRepr());
//    }
//
//    @Test
//    public void test_Min_Max() {
//        Amount d75 = a50.add(b20).add(c5);
//
//        assertEquals(a50.min(b20), b20);
//        assertEquals(b20.min(c5), c5);
//        assertEquals(b20.max(d75), d75);
//        assertEquals(b20.max(c5), b20);
//        assertEquals(amt("-5/USD").max(c5), c5);
//    }
//
//    @Test
//    public void test_Equals() {
//        assertTrue(a50.equals(amt("50/USD/root")));
//        assertFalse(a50.equals(amt("50/USD/bob")));
//        assertTrue(a50.equalsExceptIssuer(amt("50/USD/bob")));
//
//    }
//
//    private static Amount amt(String s) {
//        return Amount.fromString(s);
//    }
//
//    @Test
//    public void test_IOUParsing() {
//        assertEquals("USD", amt("1.0/USD").currencyString());
//        Amount amount = amt("1.0/USD/" + TestFixtures.master_seed_address);
//        assertEquals("USD", amount.currencyString());
//        assertEquals(TestFixtures.master_seed_address, amount.issuerString());
//        assertEquals(false, amount.isNative);
//    }
//
//    @Test(expected = EncodingFormatException.class)
//    public void test_IOUIssuer_Validation() {
//        amt("1.0/USD/" + TestFixtures.root_account + "F");
//    }
//
//    @Test(expected = RuntimeException.class)
//    public void test_Check_Whole() {
//        Amount.checkDropsValueWhole("1.0");
//    }
//
//
//    @Test
//    public void test_Zero_USDEquals_Zero_USD() {
//        Amount a = amt("0/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("0/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertTrue(a.equals(b));
//    }
//    @Test
//    public void test_Zero_USDEquals_Negative_Zero_USD() {
//        Amount a = amt("0/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("-0/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertTrue(a.equals(b));
//    }
//    @Test
//    public void test_Zero_STREquals_Zero_STR() {
//        Amount a = amt("0");
//        Amount b = amt("0.0");
//        assertTrue(a.equals(b));
//    }
//    @Test
//    public void test_Zero_STREquals_Negative_Zero_STR() {
//        Amount a = amt("0");
//        Amount b = amt("-0");
//        assertTrue(a.equals(b));
//    }
//    @Test
//    public void test_10_USD_Equals_10_USD() {
//        Amount a = amt("10/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("10/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertTrue(a.equals(b));
//    }
//    @Test
//    public void test_Equality_Of_USD_with_Fraction() {
//        Amount a = amt("123.4567/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("123.4567/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertTrue(a.equals(b));
//    }
//    @Test
//    public void test_10_Drops_Equals_10_Drops() {
//        Amount a = amt("10");
//        Amount b = amt("10");
//        assertTrue(a.equals(b));
//    }
//    @Test
//    public void test_Fractional_STR_Equality() {
//        Amount a = amt("1.1");
//        Amount b = amt("11.0").divide(10);
//        assertTrue(a.equals(b));
//    }
//    @Test
//    public void test_Equality_Ignoring_Issuer() {
//        Amount a = amt("0/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("0/USD/rH5aWQJ4R7v4Mpyf4kDBUvDFT5cbpFq3XP");
//        assertTrue(a.equalsExceptIssuer(b));
//    }
//    @Test
//    public void test_Trailing_Zeros_Equality_Ignoring_Issuer() {
//        Amount a = amt("1.1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("1.10/USD/rH5aWQJ4R7v4Mpyf4kDBUvDFT5cbpFq3XP");
//        assertTrue(a.equalsExceptIssuer(b));
//    }
//    @Test
//    public void test_IOU_Exponent_Mismatch() {
//        Amount a = amt("10/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("100/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_STR_Exponent_Mismatch() {
//        Amount a = amt("10");
//        Amount b = amt("100");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_Mantissa_Mismatch_One_IOU_Not_Equaling_Two() {
//        Amount a = amt("1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("2/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_Mantissa_Mismatch_One_STR_Not_Equaling_Two() {
//        Amount a = amt("1");
//        Amount b = amt("2");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_Mantissa_Mismatch_Fractional_IOU() {
//        Amount a = amt("0.1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("0.2/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertFalse(a.equals(b));
//    }
//    // Sign mismatch
//    @Test
//    public void test_Negativity_In_Equality_For_IOU() {
//        Amount a = amt("1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("-1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_Negativity_In_Equality_For_STR() {
//        Amount a = amt("1");
//        Amount b = amt("-1");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_Issuer_Derived_Inequality() {
//        Amount a = amt("1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("1/USD/rH5aWQJ4R7v4Mpyf4kDBUvDFT5cbpFq3XP");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_Currency_Inequality() {
//        Amount a = amt("1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("1/EUR/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_Same_Value_Yet_Native_Vs_IOU_Inequality() {
//        Amount a = amt("1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        Amount b = amt("1");
//        assertFalse(a.equals(b));
//    }
//    @Test
//    public void test_Same_Value_Yet_Native_Vs_IOU_Inequality_Operand_Switch() {
//        Amount a = amt("1");
//        Amount b = amt("1/USD/rNDKeo9RrCiRdfsMG8AdoZvNZxHASGzbZL");
//        assertFalse(a.equals(b));
//    }
//
//    @Test
//    public void test_Negate_native_123() {
//        assertEquals("-0.000123/STR", amt("123").negate().toTextFull());
//    }
//    @Test
//    public void test_Negate_native_123_2() {
//        assertEquals("0.000123/STR", amt("-123").negate().toTextFull());
//    }
//    @Test
//    public void test_Negate_non_native_123() {
//        assertEquals("-123/USD/" + rootAddress, amt("123/USD/root").negate().toTextFull());
//    }
//    @Test
//    public void test_Negate_non_native_123_2() {
//        assertEquals("123/USD/" + rootAddress, amt("-123/USD/root").negate().toTextFull());
//    }
//    //    @Test
////    public void test_Clone_non_native_123_3() {
////        assertEquals("-123/USD/" + rootAddress, amt("-123/USD/root").clone().toTextFull());
////    }
//    @Test
//    public void test_Add_STR_to_STR() {
//        assertEquals("0.0002/STR", amt("150").add(amt("50")).toTextFull());
//    }
//    @Test
//    public void test_Add_USD_to_USD() {
//        assertEquals("200.52/USD/" + rootAddress, amt("150.02/USD/root").add(amt("50.5/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_0_STR_with_0_STR() {
//        assertEquals("0/STR", amt("0").multiply(amt("0")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_0_USD_with_0_STR() {
//        assertEquals("0/USD/" + rootAddress, amt("0/USD/root").multiply(amt("0")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_0_STR_with_0_USD() {
//        assertEquals("0/STR", amt("0").multiply(amt("0/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_1_STR_with_0_STR() {
//        assertEquals("0/STR", amt("1").multiply(amt("0")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_1_USD_with_0_STR() {
//        assertEquals("0/USD/" + rootAddress, amt("1/USD/root").multiply(amt("0")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_1_STR_with_0_USD() {
//        assertEquals("0/STR", amt("1").multiply(amt("0/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_0_STR_with_1_STR() {
//        assertEquals("0/STR", amt("0").multiply(amt("1")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_0_USD_with_1_STR() {
//        assertEquals("0/USD/" + rootAddress, amt("0/USD/root").multiply(amt("1")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_0_STR_with_1_USD() {
//        assertEquals("0/STR", amt("0").multiply(amt("1/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_STR_with_USD() {
//        assertEquals("2000/STR", amt("200.0").multiply(amt("10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_STR_with_USD2() {
//        assertEquals("0.2/STR", amt("20000").multiply(amt("10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_STR_with_USD3() {
//        assertEquals("20/STR", amt("2000000").multiply(amt("10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_STR_with_USD_neg() {
//        assertEquals("-0.002/STR", amt("200").multiply(amt("-10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_STR_with_USD_neg_frac() {
//        assertEquals("-0.222/STR", amt("-6000").multiply(amt("37/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_USD_with_USD() {
//        assertEquals("20000/USD/" + rootAddress, amt("2000/USD/root").multiply(amt("10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_USD_with_USD2() {
//        assertEquals("200000000000/USD/" + rootAddress, amt("2000000/USD/root").multiply(amt("100000/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_EUR_with_USD_result_1() {
//        assertEquals("100000/EUR/" + rootAddress, amt("100/EUR/root").multiply(amt("1000/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_EUR_with_USD_neg() {
//        assertEquals("-48000000/EUR/" + rootAddress, amt("-24000/EUR/root").multiply(amt("2000/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_EUR_with_USD_neg_1() {
//        assertEquals("-100/EUR/" + rootAddress, amt("0.1/EUR/root").multiply(amt("-1000/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_EUR_with_STR_factor_1() {
//        assertEquals("100/EUR/" + rootAddress, amt("0.05/EUR/root").multiply(amt("2000")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_EUR_with_STR_neg() {
//        assertEquals("-500/EUR/" + rootAddress, amt("-100/EUR/root").multiply(amt("5")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_EUR_with_STR_neg_1() {
//        assertEquals("-100/EUR/" + rootAddress, amt("-0.05/EUR/root").multiply(amt("2000")).toTextFull());
//    }
//    @Test
//    public void test_Multiply_STR_with_STR() {
//        assertEquals("0.0001/STR", amt("10").multiply(amt("10")).toTextFull());
//    }
//    @Test
//    public void test_Divide_STR_by_USD() {
//        assertEquals("0.00002/STR", amt("200").divide(amt("10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_STR_by_USD2() {
//        assertEquals("0.002/STR", amt("20000").divide(amt("10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_STR_by_USD3() {
//        assertEquals("0.2/STR", amt("2000000").divide(amt("10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_STR_by_USD_neg() {
//        assertEquals("-0.00002/STR", amt("200").divide(amt("-10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_STR_by_USD_neg_frac() {
//        assertEquals("-0.000162/STR", amt("-6000").divide(amt("37/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_USD_by_USD() {
//        assertEquals("200/USD/" + rootAddress, amt("2000/USD/root").divide(amt("10/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_USD_by_USD_fractional() {
//        assertEquals("57142.85714285714/USD/" + rootAddress, amt("2000000/USD/root").divide(amt("35/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_USD_by_USD2() {
//        assertEquals("20/USD/" + rootAddress, amt("2000000/USD/root").divide(amt("100000/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_EUR_by_USD_factor_1() {
//        assertEquals("0.1/EUR/" + rootAddress, amt("100/EUR/root").divide(amt("1000/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_EUR_by_USD_neg() {
//        assertEquals("-12/EUR/" + rootAddress, amt("-24000/EUR/root").divide(amt("2000/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_EUR_by_USD_neg_1() {
//        assertEquals("-0.1/EUR/" + rootAddress, amt("100/EUR/root").divide(amt("-1000/USD/root")).toTextFull());
//    }
//    @Test
//    public void test_Divide_EUR_by_STR_result_1() {
//        assertEquals("0.05/EUR/" + rootAddress, amt("100/EUR/root").divide(amt("2000")).toTextFull());
//    }
//    @Test
//    public void test_Divide_EUR_by_STR_neg() {
//        assertEquals("-20/EUR/" + rootAddress, amt("-100/EUR/root").divide(amt("5")).toTextFull());
//    }
//    @Test
//    public void test_Divide_EUR_by_STR_neg_1() {
//        assertEquals("-0.05/EUR/" + rootAddress, amt("-100/EUR/root").divide(amt("2000")).toTextFull());
//    }
//
//    @Test
//    public void test_Parse_native_0(){
//        assertEquals("0/STR", amt("0").toTextFull());
//    }
//    @Test
//    public void test_Parse_native_0_pt_0(){
//        assertEquals("0/STR", amt("0.0").toTextFull());
//    }
//    @Test
//    public void test_Parse_native_negative_0(){
//        assertEquals("0/STR", amt("-0").toTextFull());
//    }
//    @Test
//    public void test_Parse_native_negative_0_pt_0(){
//        assertEquals("0/STR", amt("-0.0").toTextFull());
//    }
//    @Test
//    public void test_Parse_native_1000_drops(){
//        assertEquals("0.001/STR", amt("1000").toTextFull());
//    }
//    @Test
//    public void test_Parse_native_12_pt_3(){
//        assertEquals("12.3/STR", amt("12.3").toTextFull());
//    }
//    @Test
//    public void test_Parse_native__12_pt_3(){
//        assertEquals("-12.3/STR", amt("-12.3").toTextFull());
//    }
//    @Test
//    public void test_Parse_123_trailing_pt_USD(){
//        assertEquals("123/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", amt("123./USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh").toTextFull());
//    }
//    @Test
//    public void test_Parse_12300_USD(){
//        assertEquals("12300/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", amt("12300/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh").toTextFull());
//    }
//    @Test
//    public void test_Parse_12_pt_3_USD(){
//        assertEquals("12.3/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", amt("12.3/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh").toTextFull());
//    }
//    @Test
//    public void test_Parse_1_pt_23_with_trailing_00_USD(){
//        assertEquals("1.23/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", amt("1.2300/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh").toTextFull());
//    }
//    @Test
//    public void test_Parse_negative_0_USD(){
//        assertEquals("0/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", amt("-0/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh").toTextFull());
//    }
//    @Test
//    public void test_Parse__0_pt_0_USD(){
//        assertEquals("0/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh", amt("-0.0/USD/rHb9CJAWyB4rj91VRWn96DkukG4bwdtyTh").toTextFull());
//    }
}
