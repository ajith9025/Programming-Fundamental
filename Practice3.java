package com.chainsys.day4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice3
{


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		   System.out.println("Enter the Pattern:");
		   Pattern pattern=Pattern.compile(sc.next());
		   System.out.println("Enter the Text Message:");
		   Matcher matcher=pattern.matcher(sc.next());
		   boolean Found=false;
		   while(matcher.find())
		   {
			 System.out.println("I am ajith"+matcher.group()+" I am working in chainsys"+matcher.start()+" madurai"+matcher.end());
		     Found=true;
		   }
		   if(!Found)
		   {
			 System.out.println("No match found");
		   }
	     }
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


