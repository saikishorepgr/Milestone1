package flowcontrols;

public class Ex14 {
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		if(a==0 || a==1)
	    	System.out.println(a+" is niether prime nor composite");
		else{
		   int f=0;
		for(int i=2;i<=a/2;i++){
			
		    if(a%i==0){
		       System.out.println(a+" is not a prime number");
	    	   f=1;
		       break;
		}
	}
		if(f==0){
    		System.out.println(a+" is a prime number");}
		}
	}
}
