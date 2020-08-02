package arrays;

public class Ex11 {
	public static void main(String args[]) {
		int arr[]=new int[args.length];
		int flag=0,i;
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==4 || arr[i]==1) {
				continue;
				
			}
			else {
				flag=1;
				break;
			}
		}if(flag==1) {
			System.out.println("false");
		}else {System.out.println("true");
			
		}
	}
	}

