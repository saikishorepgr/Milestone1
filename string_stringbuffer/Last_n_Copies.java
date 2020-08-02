package string_stringbuffer;

public class Last_n_Copies {
	 	public static void main(String[] args) 
	 	{
	 		String s=args[0];
	 		int n=Integer.parseInt(args[1]);
	 		int m=s.length();
	 		int j;
	 		for(j=0;j<n;j++)
	 		{
	 			System.out.print(s.substring(m-n));
	 		}
	 	}	
	 }