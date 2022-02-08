package com.bridgelab.programs;

import java.util.Scanner;

public class FlipCoin {
	public static void coinFlipPercentage() {
		//local variables
		int head=0,tail=0;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		//computation
		for(int i=0;i<count;i++) {
			double random =  Math.random();
			if(random < 0.5)
				tail++;
			else
				head++;

		}
		System.out.println("percentage of tails("+ tail +"): " + (tail * 100f / (head+tail)));
		System.out.println("percentage of tails("+ head +"): " + (head * 100f / (head+tail)));
		sc.close();
	}

	public static void main(String[] args) {
		coinFlipPercentage();
	}
}	


