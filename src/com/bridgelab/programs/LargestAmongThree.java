package com.bridgelab.programs;

import java.util.Scanner;

public class LargestAmongThree {
	public static void checkingLargestOfThree() {
		//local variable
		int a=0,b=0,c=0,max=0;
		System.out.println("Enter 3 number = ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		//computation
		max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("max value = "+max);
		sc.close();
	}

	public static void main(String[] args) {
		checkingLargestOfThree();
	}
}	


