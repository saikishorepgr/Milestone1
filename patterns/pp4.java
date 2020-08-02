package com.wipro.patterns;
public class pp4 {
public static void main(String[] args) {
	int in = Integer.parseInt(args[0]);
    for(int i=in;i>=1;i--) 
    {
             for(int j=1;j<=i;j++) 
             {
	            System.out.print(i+" ");
             }
             System.out.println("");
    }
}
}
