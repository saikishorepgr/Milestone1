package flowcontrols;

public class Ex18 {
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int k=0,r,t=a;
		while(a!=0){
	    	r=a%10;
		    k=k*10+r;
		    a=a/10;
		}
	if (t==k){
		System.out.println(t+" is a palindrome");
	}
	else{
     		System.out.println(t+" is not a palindrome");
		}
	}
}