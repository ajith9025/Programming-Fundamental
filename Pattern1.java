package com.chainsys.day3;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j,rows=4;
		if(rows>0)
		for(i=0;i<rows;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}	
	}

}