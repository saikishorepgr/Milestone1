package com.wipro.patterns;
public class pp2 {
public static void main(String[] args) {
	int in = Integer.parseInt(args[0]);
    for(int i=1;i<=in;i++) 
    {
             for(int j=1;j<=i;j++) 
             {
	            System.out.print("* ");
             }
             System.out.println("");
    }
}
}
