
package com.chainsys.day3;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if((n>5)||(n<10))
		{
			System.out.println("2y^2+y+5 ="+((2*(n*n))+n+5));
		}
		else
		{
			System.out.println("please enter number between 5 to 10");
		}
	}

}
