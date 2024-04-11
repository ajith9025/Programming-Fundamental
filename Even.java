package com.chainsys.day3;

public class Even {

	public static void main(String[] args) {
		int num=12345;
		int evendigits=0;
		while(num>0)
		{
		    if(num%2==0) 
		    {
			 evendigits++;
		    }
		 num=num/10;
		}
		System.out.println("Enter the  Even Digits:"+evendigits);
	}
}
