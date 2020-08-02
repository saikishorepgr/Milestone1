package flowcontrols;

public class Ex16 {
	public static void main(String [] args){
		int a=Integer.parseInt(args[0]);
		for(int i=0;i<a;i++){
		    for(int j=0;j<=i;j++){
	    	  System.out.print("* ");
		}
    		System.out.println();
		}
	}
}