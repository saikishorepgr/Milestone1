package com.wipro.patterns;

//1 2 3 4 
//1 2 3 
//1 2 
//1 


public class pp11 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=n;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}System.out.println("");
		}
	}
}