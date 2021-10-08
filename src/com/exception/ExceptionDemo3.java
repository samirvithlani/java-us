package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("please Entre your age :-");
			int age = sc.nextInt();

			System.out.println("Age = " + age);
		} catch (InputMismatchException e) {

			System.out.println("pls check your input...");
		}

	}
}
