package ch.bbw.consolecalculator;

public class Calculator {
	public int summe(int summand1, int summand2) throws java.lang.ArithmeticException{
		long value = (long) summand1 + (long) summand2;
		if((value > Integer.MAX_VALUE)||(value < Integer.MIN_VALUE)) {
			throw new java.lang.ArithmeticException();
		}
		return summand1 + summand2;
	}
	public int subtraktion(int minuend, int subtrahend) throws java.lang.ArithmeticException {
		long value = (long) minuend - (long) subtrahend;
		if((value > Integer.MAX_VALUE)||(value < Integer.MIN_VALUE)) {
			throw new java.lang.ArithmeticException();
		}
		return minuend - subtrahend;
	}
	public double division(int a, int b) {
		return a/b;
	}
	public int produkt(int a, int b) {
		return a*b;
	}
}
