package com.chainsys.day4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice6
{
	public static void main(String[] args) 
	{
		 String email="ajith@cse.com";
	     System.out.println("Email:"+email);
	     if(ValidEmail(email))
	     {
	      	System.out.println("Valid");
	     }
	     else
	        System.out.println("Not Valid");
	     
		   
        String username="Ajith1234";
		System.out.println("UserName:"+username);
        if(ValidUserName(username))
        {
        	System.out.println("Valid");	
        }
        else
        	System.out.println("Not Valid");
        
        
        String passWord="ajith0507";
        System.out.println("Password:"+passWord);
        if(ValidPassword(passWord))
        {
        	System.out.println("Valid");	
        }
        else
        	System.out.println("Not Valid");
     }
	

	private static boolean ValidEmail(String email)
	{
		    String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	        Pattern pattern=Pattern.compile(regex);
	        Matcher matcher=pattern.matcher(email);
	        return matcher.matches();
	 }

	
	private static boolean ValidUserName(String username) 
	{
		String regex="^[A-Z0-9a-z]+{5,29}$";
    	Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(username);
        return matcher.matches();
	}
	

	private static boolean ValidPassword(String passWord) 
	{
		String regex="^[A-Z0-9a-z@]+{5,29}$";
    	Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(passWord);
        return matcher.matches();
	}
}


