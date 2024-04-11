package com.chainsys.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice4 
{
		 public static boolean ValidEmail(String email) 
		 {
		        String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		        Pattern pattern=Pattern.compile(regex);
		        Matcher matcher=pattern.matcher(email);
		        return matcher.matches();
		 }

		    public static void main(String[] args)
		    {
		        String email="ajith@cse.com";
		        System.out.println("Email:"+email);
		        if(ValidEmail(email))
		        {
		        	System.out.println("Valid");
		        	
		        }
		        else
		        {
		        	System.out.println("Not Valid");
		        }
		     }
		  
}



