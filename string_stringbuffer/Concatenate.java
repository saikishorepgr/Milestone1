package string_stringbuffer;

public class Concatenate {
	public static void main(String[] args) 
	{
		String s=args[0];
		String s1=args[1];
		int c=(int)s.charAt(0);
		int d=(int)s.charAt(1);
		if(c>=97 && c<=122 || d>=97 && d<=122)
		{
			String s2=s.toLowerCase();
			String s3=s1.toLowerCase();
			System.out.println(s2.concat("").concat(s3));
		}
		else
		{
			System.out.println(s.concat("").concat(s1));
		}
	}

}
