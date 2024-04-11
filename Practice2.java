package com.chainsys.day4;

import java.util.regex.Pattern;

public class Practice2
{

	public static void main(String[] args) 
	{
		System.out.println(Pattern.matches("..s","as"));
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches(".i...","aths"));
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches(".s","as"));
		

	}

}
