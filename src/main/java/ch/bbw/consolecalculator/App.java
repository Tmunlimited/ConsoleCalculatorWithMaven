package ch.bbw.consolecalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;
        
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();
        
        valueA=Integer.MAX_VALUE;
        valueB=3;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
    }
}
