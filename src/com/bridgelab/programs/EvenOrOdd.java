package com.bridgelab.programs;

import java.util.Scanner;

public class EvenOrOdd {
	public void checkEvenOdd() {
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//computation
		if(n < 0)
			System.out.print("Enter number greater than 0");
		else if (n % 2 == 0)
			System.out.print("Entered number is even");
		else
			System.out.print("Entered number is odd number");
		sc.close();
	}

	public static void main(String[] args) {
		//object creation & calling 
		EvenOrOdd obj = new EvenOrOdd();
		obj.checkEvenOdd();
	}

}
