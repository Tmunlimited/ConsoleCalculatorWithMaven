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
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25)==35);
	}
	
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

}
