package arrays;

public class Ex8 {
	 	public static void main(String [] args)
	 	{
	 		int a[]=new int[args.length];
	 		int j;
	 		for(j=0;j<args.length;j++)
	 		{
	 			a[j]=Integer.parseInt(args[j]);
	 		}
	 		int c=0;
	 		int d=0;
	 		for(j=0;j<a.length;j++)
	 		{
	 			if(a[j]==6)
	 			{
	 				c=j;
	 			}
	 			else if(a[j]==7)
	 			{
	 				d=j;
	 			}
	 		}
	 		int sum1=0;
	 		for(j=0;j<a.length;j++)
	 		{
	 			if(c<d)
	 			{
	 				if(j>=c && j<=d)
	 				{
	 					continue;
	 				}
	 				else
	 				{
	 					sum1=sum1+a[j];
	 				}
	 			}
	 			else
	 			{
	 				sum1=sum1+a[j];
	 			}
	 		}
	 		System.out.println(sum1);
	 	}
	 }