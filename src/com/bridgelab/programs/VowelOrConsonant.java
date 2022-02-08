package com.bridgelab.programs;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void checkVowelOrConsonant() {
		//local variable
		char ch ;
		System.out.print("enter the ASCII value of any character = ");
		Scanner sc = new Scanner(System.in);
		ch = (char)sc.nextInt();
		//computation
		if(( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) || ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ))
			System.out.println(ch+" is VOWEL");
		else
			System.out.println(ch+" is CONSONANT");	 
		sc.close();
	}

	public static void main(String[] args) {
		//method calling
		checkVowelOrConsonant();
	}

}
