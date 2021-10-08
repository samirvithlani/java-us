package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) throws InputMismatchException {

		Scanner sc = new Scanner(System.in);
		System.out.println("please Entre your age :-");
		int age = sc.nextInt();

		System.out.println("Age = " + age);

	}
}
