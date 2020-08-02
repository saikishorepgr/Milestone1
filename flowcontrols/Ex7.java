package flowcontrols;

public class Ex7 {
	public static void main(String[] n) {
		String s=n[0];
		char a=s.charAt(0);
		if(a>64 && a<91) {
			System.out.println(Character.toLowerCase(a));
		}
		else
			System.out.println(Character.toUpperCase(a));
		
	}

}
