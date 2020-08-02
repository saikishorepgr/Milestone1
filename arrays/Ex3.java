package arrays;

public class Ex3 {
	 	public static void main(String [] args)
	 	{
	 		int j;
	 		int key=Integer.parseInt(args[0]);
	 		int a[]=new int[args.length];
	 		for(j=1;j<args.length;j++)
	 		{
	 			a[j]=Integer.parseInt(args[j]);
	 		}
	 		int f=0;
	 		int c=0;
	 		for(j=0;j<a.length;j++)
	 		{
	 			if(a[j]==key)
	 			{
	 				f=1;
	 				c=j;
	 				break;
	 			}
	 		}
	 		if(f==0)
	 		{
	 			System.out.println("-1");
	 		}
	 		else
	 		{
	 			System.out.println(c);
	 		}
	 	}
	 }