package com.wipro.patterns;

//1 
//1 2 
//1 2 3 
//1 2 3 4 

public class pp5 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(j+" ");
			}System.out.println("");
		}
	}


}