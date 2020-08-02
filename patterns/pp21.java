package com.wipro.patterns;

//      1 
//    2 3 
//  4 5 6 
//7 8 9 10 


public class pp21 {
	public static void main(String args[]) {
		int i,j,k=1;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<(2*n-2*i)+1;j++)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
				
			}
			
			
			System.out.println("");
		}
	}

}