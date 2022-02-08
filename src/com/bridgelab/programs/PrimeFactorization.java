package com.bridgelab.programs;

import java.util.Scanner;

public class PrimeFactorization {
	public static void checkingPrimeFactorization() {
		//local variables
		int n, is_prime=1;;
		System.out.println("Enter any number = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//computation
		for(int i=2; i<n; i++)
		{
			if ( (n%i) == 0 )
			{
				for(int j=2; j<i; j++)
				{
					if ( (i%j) == 0 )
					{
						is_prime=0 ;
						break;
					}
				}
				//checking entered number is prime or not
				if ( is_prime == 1 )
					System.out.println(i+" is a prime no.");
				else
					System.out.println(i+" is not a prime no.");
			}
		}
	}

	public static void main(String[] args) {
		//method calling
		checkingPrimeFactorization();
	}

}
