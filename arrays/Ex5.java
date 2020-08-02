package arrays;

public class Ex5 {
public static void main(String args[])
	
	{
		int arr[]=new int[args.length];
		int small1=Integer.MAX_VALUE,small2=Integer.MAX_VALUE,big1=Integer.MIN_VALUE,big2=Integer.MIN_VALUE,i=0;
		
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
			
		}
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>big1) {
				big2=big1;
				big1=arr[i];
			}else if(arr[i]>big2) {
				big2=arr[i];
			}
			if(arr[i]<small1)
			{
				small2=small1;
				small1=arr[i];
			}else if(arr[i]<small2) {
				small2=arr[i];
			}
		}
		System.out.println(big1+" "+big2);
		System.out.println(small1+" "+small2);
		
		
	}



}
