package com.Strinig;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {

		String name = "malayalammmm";
		System.out.println("pls insert char to count");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int count = 0;
		
		//name is string
		StringBuffer sb = new StringBuffer(name);
		
		

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == c) {

				count++;
			}

		}
		System.out.println(c + " is repeting " + count + " times");

	}
}
