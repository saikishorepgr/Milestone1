package arrays;

public class Ex14 {
public static void main(String args[]) {
	    
	    int arr[]=new int[9];
	    int i,max=Integer.MIN_VALUE;
		for(i=0;i<9;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		if(args.length!=9) {
			System.out.println("please enter 9 numbers");
		}
		else {
			
			System.out.println("the given array is :");
			for(i=0;i<9;i++)
			{
				if(arr[i]>max) {
					max=arr[i];
				}
				if(i%3==0)
			{
				System.out.println("");
			}
				System.out.print(arr[i]+" ");
				
			}
			System.out.println("");
			System.out.println("The biggest number in the given array is "+max);
		}
		}
}
