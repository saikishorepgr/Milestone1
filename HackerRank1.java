import java.util.Scanner;

public class HackerRank1{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int testCases,iterator;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();
        while(testCases-->0)
        {
            int divisibleNumber=0;
            boolean flag=false;
            int product=1;
            int length = scan.nextInt();
            int []arr = new int[length];
            for(iterator = 0;iterator<length;iterator++)
            {
                arr[iterator] = scan.nextInt();
                product *= arr[iterator];
            }
            int temp;
            for(iterator=2;iterator<(product);iterator++)
            {
                temp = iterator*iterator;
                if(product%temp==0)
                {
                    divisibleNumber = iterator;
                    break;
                }
            }
            System.out.println((divisibleNumber));
        }
    }
}
