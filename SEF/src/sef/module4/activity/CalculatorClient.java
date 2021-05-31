package sef.module4.activity;

/**
 * @author
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class.
		*/
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");

		// Add
		int result = normalCalc.add(10, 5);
		System.out.println("1) Add result is " + result);

		// Substract
		int res = normalCalc.subtract(12, 2);
		System.out.println("2) Substract result is " + res);


		// Multiply
		int[] mul = {2, 3, 4};
		result = normalCalc.multiply(mul);
		System.out.println("3) Multiplication result is " + result);

		// Divide
		double divValue = normalCalc.divide(12, 2);
		System.out.println("4) Divide result is " + divValue);





	}




}
