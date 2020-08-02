package com.wipro.patterns;

//1 1 1 1 
//2 2 2 
//3 3 
//4 


public class pp9 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=n;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(n-i+1+" ");
			}System.out.println("");
		}
	}

}