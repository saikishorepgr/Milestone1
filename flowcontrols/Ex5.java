package flowcontrols;

public class Ex5 {
	public static void main(String[] n) {
		String s=n[0];
		char a=s.charAt(0);
		if((a>64 && a<91)||(a>96 && a<123))
			System.out.println("Initialized value is an Alphabhet");
		else if(a>47 && a<58)
			System.out.println("Initialized value is an Number");
		else
			System.out.println("Initialized value is an Special Character");
		
	}
	

}
