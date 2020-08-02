package arrays;

public class Ex13 {
	public static void main(String args[]) {
		int arr[]=new int[args.length];
		int i;
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}

		if(args.length!=4)
		{
			
			System.out.println("please enter 4 numbers");
		}
		else {
			System.out.println("the given array is :");
			for(i=0;i<4;i++)
			{
				System.out.print(arr[i]+" ");
			}
				
				if(i==1) {
					System.out.println("");
				}
			}
			System.out.println("");
			System.out.println("the reverse of the array is :");
			for(i=3;i>=0;i--)
			System.out.print(arr[i]+" ");
		}	
	}
