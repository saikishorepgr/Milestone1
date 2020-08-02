package flowcontrols;

public class Ex4 {
	public static void main(String[] n) {
		String s=n[0];
		String ss=n[1];
		char a=s.charAt(0);
		char b=ss.charAt(0);
		if(a>b)
			System.out.println(b+","+a);
		else
			System.out.println(a+","+b);
		
	}
}