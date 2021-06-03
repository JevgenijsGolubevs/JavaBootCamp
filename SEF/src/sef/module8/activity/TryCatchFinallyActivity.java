package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed.

public class TryCatchFinallyActivity {
	public static void main(String[] args) {
		TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
		obj.catchMeIfYouCan();
	}

	void catchMeIfYouCan()
	{
		int [] arr={0,1,2,3,4,5,6,7,8,9};
		try {
			for (int i = 0; i <= 8; i++) {
				System.out.println(arr[i]); /// + 100/0
			}
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Oh, i think u take a lot of value, bro");
		}
		catch (ArithmeticException aex) {
			System.out.println("Relax, i cant divide by 0");

		}finally {
			System.out.println("Good Programm");
		}


		System.out.println("This should get printed even if there is an exception");

	}

}