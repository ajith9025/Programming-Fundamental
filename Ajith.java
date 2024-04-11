package com.chainsys.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ajith {

	public static void main(String[] args) 
	{
		
		Pattern pattern=Pattern.compile("Ajith",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Ajith in Working");
	    boolean matchFound=matcher.find();
	    if(matchFound)
	    {
	    	System.out.println("match Found");
	    }
	    else
	    	System.out.println("match not Found");
		
	

	}

}
