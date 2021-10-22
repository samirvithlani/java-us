package com;

public class vc {

	int a[][] = new int[20][20];

	int total;

	public void add() {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				a[i][j] = 5000;
			}
		}

		
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				
				System.out.print(a[i][j]+" ");
				total = total + a[i][j];

			}
			
			System.out.println();
		}

		System.out.println("total = " + total);
	}

	int amnt;

	public void withdraw() {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j <= a.length; j++) {

			}
		}

	}

	public static void main(String[] args) {

		// 20 loko
		// 20 month

		vc v = new vc();
		v.add();
		v.withdraw();

	}
}
