package arrays;

public class Ex6 {
	public static void main(String [] args)
	{
		int j;
		int a[]=new int[args.length];
		for(j=0;j<args.length;j++)
		{
			a[j]=Integer.parseInt(args[j]);
		}
	
		for(j=0;j<a.length;j++)
		{
			System.out.print(a[j] + " ");
		}
	}
}
