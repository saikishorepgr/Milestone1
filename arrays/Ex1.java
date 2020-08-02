package arrays;

public class Ex1 {
	 	public static void main(String [] args)
	 	{
	 		int j;
	 		int a[]=new int[args.length];
	 		for(j=0;j<args.length;j++)
	 		{
	 			a[j]=Integer.parseInt(args[j]);
	 		}
	 		int sum1=0;
	 		float avg;
	 		for(j=0;j<a.length;j++)
	 		{
	 			sum1=sum1+a[j];
	 		}
	 		avg=sum1/a.length;
	 		System.out.println("Sum is: " + sum1);
	 		System.out.println("Average is: " + avg);
	 	}
	 }