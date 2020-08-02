package string_stringbuffer;

public class Remove_x {
			 	public static void main(String[] args) 
			 	{
			 		String s=args[0];
			 		int n=s.length();
			 		if(((s.charAt(0))=='x') &&((s.charAt(n-1))=='x'))
			 		{
			 			System.out.println(s.substring(1,n-1));
			 		}
			 		else if((s.charAt(n-1))=='x')
			 		{
			 			System.out.println(s.substring(0,n-1));
			 		}
			 		else if((s.charAt(0))=='x')
			 		{
			 			System.out.println(s.substring(1,n));
			 		}
			 			
			 		else
			 		{
			 			System.out.println(s);
			 		}
			 	}	
			 }