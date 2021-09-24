package com.Strinig;

public class StringDemo {

	
	public static void main(String[] args) {
		
		String name = "royal";
		
		System.out.println("name = "+ name);
		
		//"royal" + "java"  -->royaljava
		//-->at same object we are changing..
		name.concat("java");
		
		//String a = java+royal
				//a = "java+royal"
		
		
		
		System.out.println("concat -->"+name);
		
		
		//name = "royal1";
		//System.out.println("after change..."+name);
	}
}
