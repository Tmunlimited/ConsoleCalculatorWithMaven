package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorPrivateTest {
	private Calculator testee;
	
	@Before
	public void setup() {
		testee = new Calculator();
	}
	
	// Start TEst Produkt
	
	@Test
	public void testProduktZweiPositiveIsOk() {
		assertTrue(testee.produkt(8,2)==16);
	}
	
	@Test
	public void testProduktEinePositivEineNegativIsOk() {
		assertTrue(testee.produkt(-8,2)==-16);
	}
	
	@Test
	public void testProduktNullEinePositivIsOk() {
		assertTrue(testee.produkt(0,2)==0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testProduktIstGroesserAlsMax() {
		testee.produkt(Integer.MAX_VALUE,2);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testProduktIstKleinerAlsMin() {
		testee.produkt(Integer.MIN_VALUE,2);
	}

	// End Test Produkt
}

