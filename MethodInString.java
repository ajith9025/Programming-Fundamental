package com.chainsys.day4;

public class MethodInString
{
	
    public static void main(String[] args)
	{
		String name="ajith";
		int Id=354;
		double salary=10000;
		String dept=" cse";
		System.out.println(name.toLowerCase());
		System.out.println(name.compareTo(dept));
		System.out.println(dept.compareToIgnoreCase(name));
		System.out.println(name.charAt(3));
		System.out.println(name.concat(dept));
		System.out.println(dept.codePointAt(0));
		System.out.println(dept.codePointBefore(2));
		System.out.println();
	}
}
