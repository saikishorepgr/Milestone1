package string_stringbuffer;
import java.util.*;
import java.io.*;
import java.lang.*; 


public class Remove_ {
	public static void main(String[] args) 
	{
		Scanner x=new Scanner(System.in);
		String s=x.nextLine();
		s=s.replace("*",",");
		String s1[]=s.split(",");
		int j;
		for(j=0;j<s1.length;j++)
		{
			if(j+1<s1.length)
			{
				int n=s1[j].length();
				int m=s1[j+1].length();
				System.out.print(s1[j].charAt(0));
				System.out.print(s1[j+1].charAt(m-1));
			}
			System.out.println();
		}
	}

}
