package sef.module8.activity;
// Needs to be completed
public class ArithmeticExceptionActivity {
	static void catchMe() {

	try {
		int num1 = 10;
		int num2 = 2;
		int result = num1 / num2;
		System.out.println("The result is :" + result);
	}catch (Exception ex) {
		System.out.println("Exception is used!" + 100/0);
	}
	finally {
		System.out.println("Thank you for using this program.");
	}
	}
	//1 - Type main method and call catchMe with 10 and 0
	public static void main(String args[]) {
		catchMe();

	}
}
//	{
//		//The following code results in an Exception.
//		//2 - Identify the exception and write code to handle this exception.
//		int result=num1/num2;
//		System.out.println("The result is :" + result);
//
//		//3 - After handling the exception, write a finally block which
//		//prints a message "Thank you for using this program."
//
//		//4- try to call catchMe with 10 and 2 now and see which messages get printed.
//
//	}
//
//}