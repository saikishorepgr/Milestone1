package com.wipro.patterns;

//4 3 2 1 
//4 3 2 
//4 3 
//4 


public class pp12 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=n;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(n-j+1+" ");
			}System.out.println("");
		}
	}


}