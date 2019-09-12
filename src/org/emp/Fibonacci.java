package org.emp;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1;
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sm.nextInt();
		System.out.println("\nFibonnaci series for given range:");
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n;i++) {
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
	}
	
}
}
