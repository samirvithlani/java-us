package com.exception;

import java.util.InputMismatchException;
///we have only package which is not need to import is java.lang
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("pls enter no ");
			int no = sc.nextInt();

			int ans = 10 / no;

			System.out.println(ans);
		} catch (ArithmeticException e) {

			System.out.println("cannot divide by zero");
		} catch (InputMismatchException e) {

			System.out.println("pls check your input..");
		}

	}
}
