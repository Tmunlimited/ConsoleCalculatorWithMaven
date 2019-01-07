package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Before
	public void setup() {
		testee = new Calculator();
	}
	
	// Start Test Summe
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25)==35);
	}
	
	@Test
	public void testSummeEinePositiveUndNegativIsOk() {
		assertTrue(testee.summe(10, -25)==-15);
	}
	@Test
	public void testSummeEinePositiveUndNullIsOk() {
		assertTrue(testee.summe(10, 0)==10);
	}
	
	@Test
	public void testSummeMaxIntPlusPositiveWraps() {
		assertTrue(testee.summe(Integer.MAX_VALUE, 3)==Integer.MIN_VALUE+2);
	}
	
	// End Test Summe
	
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25,10)==15);
	}
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(8,2)==4);
	}
	
	@Test
	public void testProduktZweiPositiveIsOk() {
		assertTrue(testee.produkt(8,2)==16);
	}

	@Test(expected=ArithmeticException.class)
	public void testDivisionByZeroException() {
	    testee.division(5, 0);
	}
	
//	@Test
//	public void testDivisionByZeroExceptionNotRaised() throws ArithmeticException{
//		testee.division(5, 0);
//	}
}
