package com.chainsys.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice5
{

    public static void main(String[] args)
    {
        String passWord="ajith@0507";
        System.out.println("Password:"+passWord);
        if(ValidPassword(passWord))
        {
        	System.out.println("Valid");
        	
        }
        else
        	System.out.println("Not Valid");
     }

	private static boolean ValidPassword(String passWord) 
	{
		String regex="^[A-Z0-9a-z@]+{5,29}$";
    	Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(passWord);
        return matcher.matches();
	}
  
}




    	
