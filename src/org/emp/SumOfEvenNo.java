package org.emp;

public class SumOfEvenNo {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i<=10;i++) {
			if(i%2==0) {
				count= count+i;
			}
		}
			System.out.println(count);
		}
	}


