package flowcontrols;

public class Ex8 {
	public static void main(String[] n) {
		String s=n[0];
		char a=s.charAt(0);
		switch(a) {
		case 'R':
			System.out.println(a+"->Red");break;
		case 'B':
			System.out.println(a+"->Blue");break;
		case 'G':
			System.out.println(a+"->Green");break;
		case 'O':
			System.out.println(a+"->Orange");break;
		case 'Y':
			System.out.println(a+"->Yellow");break;
		case 'W':
			System.out.println(a+"->White");break;
			default :
				System.out.println("Invalid Code");break;
		}
	}
}