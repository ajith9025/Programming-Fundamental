package com.chainsys.day2;

import java.util.Scanner;

public class Arithmetic4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=10;
		int num2=5;
		int num3=30;
		int num4;
		System.out.println("Enter the A value:");
		int a=sc.nextInt();
		System.out.println("Enter the B value:");
		int b=sc.nextInt();
		
		//arithmetic operator
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		
		//Relational operator
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
		System.out.println("Num1==Num2:"+(num1==num2));
		
		//unary operator
		System.out.println("postincrement:" + (a++));
        System.out.println("preincrement:" + (++a));
        System.out.println("postdecrement:" + (a--));
        System.out.println("predecremnt:" + (--a));
        
        //logical operator
       if((num1<num2)&&(num2<num3))
       {
            num4=num1+num2+num3;
            System.out.println("Num4:"+num4);
       }
       else
    	   System.out.println("false");
       
       //assignment operator
       System.out.println(a==b);
       System.out.println(a!=b);
       System.out.println(a+=b);
       System.out.println(a*=b);
       System.out.println(a-=b);
       System.out.println(a/=b);
       System.out.println(a%=b);
       
       
	}

}
