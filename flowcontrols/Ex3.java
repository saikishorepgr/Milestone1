package flowcontrols;

public class Ex3 {
	public static void main(String[] n) {
		int i;
		if(n.length==0)
			System.out.println("No Values");
		else
		{
			for(i=0;i<(n.length)-1;i++) {
			System.out.print(n[i]+",");
			}
			System.out.print(n[i]);
		}
	}

}
