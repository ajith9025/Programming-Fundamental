package com.chainsys.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

	public static void main(String[] args)
	{Pattern pattern=Pattern.compile("Ajith");
	Matcher matcher=pattern.matcher("Ajith");
    boolean matchFound=matcher.matches();
    if(matchFound)
    {
    	System.out.println("match Found");
    }
    else
    	System.out.println("match not Found");
	

	}

}
