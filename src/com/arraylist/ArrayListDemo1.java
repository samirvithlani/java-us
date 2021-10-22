package com.arraylist;

import java.util.ArrayList;

//add,size

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// <> type safty 1.6
		// arraylist is an group of objects
		// array is an group of similar kind of data
		// we are not giving size
		// arrylist is an group of objects and array is group of elements
		ArrayList<String> list = new ArrayList<String>();

		list.add("Vatsal"); // at 0th index of ArrayList
		list.add("Hirav");
		list.add("Juli");
		list.add("Kush");
		list.add("Jay");
		list.add("Diya");
		list.add("Parth");
		list.add(0, "Shreya");
		list.add(4, "Hersal");

		// iterate data from arraylist object

//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));

		// size of list / length of list

		int len = list.size();
		System.out.println("len = " + len);

//		for (int i = 0; i < len; i++) {
//
//			System.out.println(list.get(i));
//		}

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		System.out.println("AFTER REMOVINF DATA FROM LIST...");

		// list.remove(0);
		//if we are using remove method with obejct, if data is remove from list it will return true
		//and not removed it wil return false....
		boolean result = list.remove("Diyaaaaaaa");
		System.out.println("RESULT === "+result);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		// ArrayList list1 = new ArrayList ();
		// list1.add(false);

	}
}
