package com.bridgelab.programs;

import java.util.Scanner;

public class Swap2Numbers {
	public static void Swap(int x, int y) {
			int temp=0;
			temp=x;    //x+=y;
			x=y;       //y-=x;
			y=temp;   //x+=y;
			System.out.println("After swapping x = "+x+" y = "+y);
		}

	public static void main(String[] args) {
		int x=0,y=0;
		System.out.println("enter 2 numbers : ");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping x = "+x+" y = "+y);
		Swap(x,y);
		sc.close();
	}		
}
	


