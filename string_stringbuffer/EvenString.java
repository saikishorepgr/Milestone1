package string_stringbuffer;

public class EvenString {
	public static void main(String[] args) 
	{
		String s=args[0];
		int n=s.length();
		if(n%2==0)
		{
			int v=n/2;
			System.out.println(s.substring(0,v));
		}
		else
		{
			System.out.println("null");
		}
		
	}	


}
