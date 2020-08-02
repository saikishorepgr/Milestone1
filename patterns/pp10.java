package com.wipro.patterns;

//4 4 4 4 
//3 3 3 
//2 2 
//1 

public class pp10 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=n;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}System.out.println("");
		}
	}

}