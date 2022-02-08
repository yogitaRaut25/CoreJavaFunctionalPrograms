package com.bridgelab.programs;

import java.util.Scanner;

public class QuotientRemainder {
	public void checkingQuotientRemainder() {
		//local  variables
		int n =0, remainder=0, quotient=0;
		System.out.print("enter any number = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//computation
		remainder=n%10;
		quotient=n/10;
		System.out.println("Remainder of "+n+" = "+remainder);
		System.out.println("Quotient of "+n+" = "+quotient);
		sc.close();
	}

	public static void main(String[] args) {
		//object creation & calling
		QuotientRemainder obj = new QuotientRemainder();
		obj.checkingQuotientRemainder();
	}

}
