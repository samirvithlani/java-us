package com.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		// arrayIndexOutOfBound exception
		// run time excpetion....

		int a[] = new int[] { 10, 20, 30 };

		try {
			for (int i = 0; i <= a.length; i++) {
//
//			a[0] = 10
//					a[1] = 20
//					a[2] = 30
//					a[3]= exception
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("please check array size....");

		} finally {

			// we can write finally block after catch block or try block..
			// if exception comes finally block will execute and if exception not comes
			// finally block will be exceute
			// so any how finally block will exceute...
			// we can write clean up process in finally block...
			// we can close objects here...

			System.out.println("finally called....");
		}

	}
}
