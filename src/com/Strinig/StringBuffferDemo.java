package com.Strinig;

public class StringBuffferDemo {

	
	public static void main(String[] args) {
		
		//only one package in java which is not required to import is java.lang pack
		
		StringBuffer sb = new StringBuffer("java");
		//mutable
		//appand method...
		
		//java+python
		//sb.append("python");
		//sb.reverse();
		//sb.deleteCharAt(0);
//		0 =j    #
//		1 = a   #
//		2 =v    #
//		3 =a
				
				
		//sb.replace(0, 4, "#");		
		sb.insert(1, "*");
		System.out.println(sb);
		
		// java   -> a -->
		
		
		
	}
}
