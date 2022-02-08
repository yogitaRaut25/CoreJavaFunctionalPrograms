package com.bridgelab.programs;

import java.util.Scanner;

public class PowerOf2 {
	public static void powerChecking(int power1) {
		//local variables
		int power2=0,j=1;
		//computation
		for(int i=1; i<=j; ++i) {
			if(power2 >= power1)
				break;
			else {
				power2=(int) Math.pow(2, i);
				System.out.println("2 to the power of "+i+" = "+power2);
			}
			j++;
		}
	}

	public static void main(String[] args) {
		//local variables
		int n=0;
		int power1=0;

		System.out.println("enter value of n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		power1=(int) Math.pow(2, n);
		powerChecking(power1);
	}
}	




