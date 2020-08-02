package flowcontrols;

public class Ex6 {
	public static void main(String[] n) {
		int a=Integer.parseInt(n[1]);
		if(n[0]=="Female") {
			if(a>0 && a<59)
				System.out.println("The percentage of interest 8.2%");
			else
				System.out.println("The percentage of interest 9.2%");
		}
		else {
			if(a>0 && a<59)
				System.out.println("The percentage of interest 8.4%");
			else
				System.out.println("The percentage of interest 10.5%");
		}
		
	
	}
}