package com.chainsys.day3;

public class Digits {

	public static void main(String[] args) 
	{ 
 
		int num=12345;
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num=num/10;
		}
		System.out.println("Sum of Digits:"+sum);
		
		
		
	}

}
