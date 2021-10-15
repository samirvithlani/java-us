package com.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter size of an array");
		int size = sc.nextInt();

		
		int a[] = new int[size];
		// we can store 10 elements
		// index <-- 0th index
//
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 100;
//		a[3] = 55;
//		a[4] = 555;

		for (int i = 0; i < size; i++) {

			System.out.println("pls enter elements of an array");
			a[i] = sc.nextInt();

		}

		// how to find len of an array
		// property of an array
		// Array class they have created one static variable named length

		int len = a.length;
		System.out.println("len of an array" + len);

		for (int i = 0; i < len; i++) {

			System.out.println(a[i]);
		}

	}
}
