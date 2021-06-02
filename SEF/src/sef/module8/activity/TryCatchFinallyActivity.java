package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed.

import java.sql.SQLOutput;

public class TryCatchFinallyActivity {
	public static void main(String[] args) {
		TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
		obj.catchMeIfYouCan();
		System.out.println("This should get printed even if there is an exception");

	}

	void catchMeIfYouCan() {

		try {
			int[] arr = {0, 1, 2, 3, 4, 5};

			for (int i = 0; i <= 4; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("The number is out of range");

			} finally {
				System.out.println("This is final result of exception");

		}

	}

}