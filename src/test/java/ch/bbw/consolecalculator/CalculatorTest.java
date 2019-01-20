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
	public void testSummeZweiNegativIsOk() {
		assertTrue(testee.summe(-10, -15)==-25);
	}
	
	@Test
	public void testSummeMinAndPositive() {
		assertTrue(testee.summe(Integer.MIN_VALUE, 2)==-2147483646);
	}
	
	@Test
	public void testSummeResultZero() {
		assertTrue(testee.summe(15, -15)==0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testSummeMaxIntPlusPositiveThrowsException() {
		testee.summe(Integer.MAX_VALUE, 3);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testSummeMinIntPlusNegativeThrowsException() {
		testee.summe(Integer.MIN_VALUE, -3);
	}
	
	// End Test Summe
	
	
	// Start Test Subtraktion
	
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25,10)==15);
	}
	
	@Test
	public void testSubtraktionEinePositiveUndNegativIsOk() {
		assertTrue(testee.subtraktion(10, -25)==35);
	}
	@Test
	public void testSubtraktionEinePositiveUndNullIsOk() {
		assertTrue(testee.subtraktion(10, 0)==10);
	}
	
	@Test
	public void testSubtraktionZweiNegativIsOk() {
		assertTrue(testee.subtraktion((-10), (-15))==5);
	}
	
	@Test
	public void testSubtraktionMinAndNegative() {
		assertTrue(testee.subtraktion(Integer.MIN_VALUE, -2)==-2147483646);
	}
	
	@Test
	public void testSubtraktionResultZero() {
		assertTrue(testee.subtraktion(15, 15)==0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testSubtraktionMaxIntMinusNegativeThrowsException() {
		testee.subtraktion(Integer.MAX_VALUE, -3);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testSubtraktionMinIntMinusPositiveThrowsException() {
		testee.subtraktion(Integer.MIN_VALUE, 3);
	}
	
	// End Test Subtraktion
	
	// Start Test Division
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(8,2)==4);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivisionByZeroException() {
	    testee.division(5, 0);
	}
	
	@Test
	public void testDivisionReturnsRoundedInt() {
		assertTrue(testee.division(10,3)==3);
	}
	
	@Test
	public void testDivisionNegativeZahlReturnsRoundedInt() {
		assertTrue(testee.division(10,-3)==-3);
	}
	
	@Test
	public void testDivisionEinePositiveUndNegativIsOk() {
		assertTrue(testee.division(10, -2)==-5);
	}
	
	@Test
	public void testDivisionEineNegativUndPositiveIsOk() {
		assertTrue(testee.division(-10, 2)==-5);
	}
	
	@Test
	public void testDivisionNullUndPositiveIsOk() {
		assertTrue(testee.division(0, 2)==0);
	}
	@Test
	public void testDivisionZweiNegativeIsOk() {
		assertTrue(testee.division((-2), (-2))==1);
	}
	
	
	// End Test Division
	
	// Start TEst Produkt
	
	@Test
	public void testProduktZweiPositiveIsOk() {
		assertTrue(testee.produkt(8,2)==16);
	}

	// End Test Produkt
}
