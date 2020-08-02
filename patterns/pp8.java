package com.wipro.patterns;

//****
//***
//**
//*


public class pp8 {
	public static void main(String args[]) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print("*");
			}System.out.println("");
		}
	}

}