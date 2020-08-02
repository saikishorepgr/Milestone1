import java.util.Scanner;

public class Practice5
{
    public static void main(String[]args)
    {
        int testCases;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();
        while(testCases-->0)
        {
            int tomPower = scan.nextInt();
            if(tomPower%2!=0)
                System.out.println((tomPower-1)/2);
            else
                System.out.println(tomPower/4);
        }
    }
}