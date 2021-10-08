package com.exception;

//compile time exception 
public class ExceptionDemo5 {

	public void div() throws Exception {

		// try catch block here...

		int no1 = 10, no2 = 0;

		int c = no1 / no2;

		System.out.println(c);

	}

	// if i have given hw to you.. throw hw to your fellow... he/she has to complate
	// or he or she can throws also....

	public static void main(String[] args) throws Exception {

		// error and compile time exception

		ExceptionDemo5 obj = new ExceptionDemo5();

		obj.div();

	}
}
