package flowcontrols;

public class Ex12 {
	public static void main(String[] n) {
		int a=Integer.parseInt(n[0]);
		int i,f=0;
		if(a<=1)
			System.out.println("Not Prime");
		else if(a==2 && a==3)
			System.out.println("Prime Number");
		else if(a%2==0 || a%3==0)
			System.out.println("Not Prime");
		else {
			for(i=5;i*i<=a;i=i+6)
			{
				if(a%i==0 || a%(i+2)==0) {
					System.out.println("Not Prime");
					f=1;
					break;
				}
			}
			if(f==0)
				System.out.println("Prime Number");
			
		}
		
	}

}
