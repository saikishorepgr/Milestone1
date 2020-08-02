package arrays;

public class Ex2 {
	 	public static void main(String [] args)
	 	{
	 		int j;
	 		int a[]=new int[args.length];
	 		for(j=0;j<args.length;j++)
	 		{
	 			a[j]=Integer.parseInt(args[j]);
	 		}
	 		int min=a[0];
	 		for(j=0;j<a.length;j++)
	 		{
	 			if(a[j]<a[0])
	 			{
	 				min=a[j];
	 			}
	 			else
	 			{
	 				continue;
	 			}
	 		}
	 		System.out.println("Minimum element is: " + min);
	 		int max=a[0];
	 		for(j=0;j<a.length;j++)
	 		{
	 			if(a[j]>a[0])
	 			{
	 				max=a[j];
	 			}
	 			else
	 			{
	 				continue;
	 			}
	 		}
	 		System.out.println("Maximum element is: " + max);
	 	}
	 }