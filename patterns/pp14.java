package com.wipro.patterns;


//   *
//  **
// ***
//****

public class pp14 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<n-i+1;j++)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<i+1;j++)
			{
				System.out.print("*");
				
			}
			
			
			System.out.println("");
		}
	}

}