package string_stringbuffer;

public class Short_Long_Short {
			 	public static void main(String[] args) 
			 	{
			 		String s=args[0];
			 		String s1=args[1];
			 		int n=s.length();
			 		int m=s1.length();
			 		if(n>m)
			 		{
			 			System.out.println(s1+s+s1);
			 		}
			 		else
			 		{
			 			System.out.println(s+s1+s);
			 		}
			 	}	
			 }