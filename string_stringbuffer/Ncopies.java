package string_stringbuffer;

public class Ncopies {
	public static void main(String[] args) 
	{
		String s=args[0];
		int n=s.length();
		int j;
		for(j=0;j<n;j++)
		{
			System.out.print(s.substring(0,2));
		}
	}


}
