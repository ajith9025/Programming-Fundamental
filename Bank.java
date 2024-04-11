package com.chainsys.day2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		String accountName;
		String accountType;
		int branchCode;
		String branchname="SBI";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accountName:");
		accountName=sc.next();
		System.out.println("Enter the accoutType:");
	    accountType = sc.next();
		System.out.println("Enter the branchCode:");
		branchCode=sc.nextInt();
		System.out.println("Branchname:"+branchname);	
		
	}

}
