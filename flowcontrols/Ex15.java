package flowcontrols;

public class Ex15 {
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		if(a<=9)
		    System.out.println(a);
		else{
		  int r;
		  int s=0;
		while(a>0){
		    r=a%10;
	    	s=s+r;
	    	a=a/10;
		}
		System.out.println(s);
		}
	}
}