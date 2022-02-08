package com.bridgelab.programs;

import java.util.Scanner;

public class HarmonicNumber {
	//method computation
	public static void harmonicNumber(int n) {
		//local variable inside method
		double sum=0;
		for(int i=1; i<=n; i++) {
			sum+= (double)(1/i);
			System.out.println("1/"+i);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		//local variable
		int n=1;
		System.out.print("enter the value of n = ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		//method calling
		harmonicNumber(n);
		sc.close();
	}
}	


