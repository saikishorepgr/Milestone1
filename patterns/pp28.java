package com.wipro.patterns;

//4321
// 321
//  21
//   1

public class pp28 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(j=n;j>=i;j--)
			{
				System.out.print(j-i+1);
				
			}
			
			
			System.out.println("");
		}
	}
}