package com.wipro.patterns;

//      1 
//    2 1 
//  3 2 1 
//4 3 2 1 


public class pp20 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<(2*n-2*i)+1;j++)
			{
				System.out.print(" ");
				
			}
			for(j=n;j>n-i;j--)
			{
				System.out.print(i+j-n+" ");
				
			}
			
			
			System.out.println("");
		}
	}

}