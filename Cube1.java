package com.chainsys.day3;

import java.util.Scanner;

public class Cube1
{

	public static void main(String[] args)
	{ 
		int num=7;
		Scanner sc=new Scanner("System.in");
		System.out.println("num:"+num);
		if(num>0)
		System.out.println("Even No till:"+num);
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
			}
			
		} 
		System.out.println();
		System.out.println("Odd No till:"+num);
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+"");
			}	
		}
		System.out.println();
	    System.out.println("Cube of:"+(num*num*num)); 
	}
}
