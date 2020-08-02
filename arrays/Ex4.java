package arrays;

public class Ex4 {
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
	 			char c=(char)a[j];
	 			System.out.print(c +" ");
	 		}
	 	}
	 }