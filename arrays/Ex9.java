package arrays;

import java.util.Arrays;

public class Ex9 {
	public static void main(String args[]) {
		int arr[]=new int[args.length];
		int arr1[]=new int[args.length];
		int i,c=0,j=0;
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<args.length;i++) {
			if(arr[i]==10)
			{  c++;
				continue;
			}
			arr1[j]=arr[i];
			j++;
			
		}for(i=args.length-c;i<args.length;i++) {
			arr1[i]=0;
		}
		System.out.print(Arrays.toString(arr1));
		
		
	}
}