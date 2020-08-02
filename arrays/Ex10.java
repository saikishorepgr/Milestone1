package arrays;

public class Ex10 {
	public static void main(String [] args)
	{
		int a[]=new int[args.length];
		int j;
		for(j=0;j<args.length;j++)
		{
			a[j]=Integer.parseInt(args[j]);
		}
		int max=a[0];
		if((a.length<9) || (a.length>9))
		{
			System.out.println("Please enter 9 integer elements");
		}
		else
		{
			for(j=0;j<a.length;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
			}
			System.out.println("maximum element is: " + max);
		}
	}
}
