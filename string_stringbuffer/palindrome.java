package string_stringbuffer;

public class palindrome {
	public static void main(String[] args) 
	{
		String s=args[0];
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=String.valueOf(sb);
		if(s1.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}		
	}


}
