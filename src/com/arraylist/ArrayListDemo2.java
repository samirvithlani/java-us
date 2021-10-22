package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> users = new ArrayList<String>();

		for (int i = 1; i <= 5; i++) {

			System.out.println("please add user name");
			String uname = sc.next();
			users.add(uname);
		}

		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}

		System.out.println("please enter user name to remove:::");
		String runame = sc.next();
		boolean result = users.remove(runame);

		if (result == true) {

			System.out.println("user is removed...");

			for (int i = 0; i < users.size(); i++) {
				System.out.println(users.get(i));
			}

		} else {

			System.out.println("user is not exist...");
		}

	}
}
