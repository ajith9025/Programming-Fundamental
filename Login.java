package com.chainsys.day3;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String username="ajith1234";
		int password=3456;
		Scanner sc=new Scanner(System.in);
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		if(password==3456&&username=="ajith1234")
		{
			System.out.println("Login Valid");
		}
		else
			System.out.println("Login Invalid");	
	}

}
