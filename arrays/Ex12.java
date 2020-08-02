package arrays;

import java.util.Arrays;

public class Ex12 {
	public static void main(String args[]) {
		int arr[]=new int[3];
		int arr1[]=new int[3];
		int printArr[]=new int[2];
		int i;
		for(i=0;i<3;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<3;i++) {
			arr1[i]=Integer.parseInt(args[i+3]);
		}
		printArr[0]=arr[arr.length/2];
		printArr[1]=arr1[arr1.length/2];
		System.out.println(Arrays.toString(printArr));	}

}