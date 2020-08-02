package flowcontrols;

public class Ex17 {
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int r;
		int n=0;
		while(a>0){
		    r=a%10;
		    n=n*10;
	    	n=n+r;
    		a=a/10;
		}
		System.out.println(n);
	}
}