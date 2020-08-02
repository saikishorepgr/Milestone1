import java.util.Scanner;

public class HackerRank2
{
    static boolean trial(int number)
    {
        boolean flag1 = false;
        boolean flag2 = true;
        int temporaryVariable = number;
        int sum = 0;
        while(temporaryVariable>0)
        {
            sum+=(temporaryVariable%10)*(temporaryVariable%10);
            temporaryVariable/=10;
        }
        if(Math.sqrt(sum)-Math.ceil(Math.sqrt(sum))==0)
        {
            flag1 = true;
        }
        int temp=0;
        temporaryVariable=number;
        while(temporaryVariable>0)
        {
            temp = temporaryVariable%10;
            temporaryVariable/=10;
            if(temp==0)
            {
                flag2=false;
            }
        }
        if(flag1==true&&flag2==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String[]args)
    {
        int testCases;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();
        while(testCases-->0)
        {
            int iterator=0;
            boolean trialValue;
            int number = scan.nextInt();
            int low,high;
            if(number==1)
            {
                low = 1;high = 10;
            }
            else if(number==2)
            {
                low = 10;high = 100;
            }
            else if(number==3)
            {
                low = 100;high = 1000;
            }
            else
            {
                low = 1000;high = 10000;
            }
            for(iterator=low;iterator<high;iterator++) {
                trialValue = trial(iterator);
                if(trialValue==true)
                {
                    System.out.println(iterator);
                    break;
                }
            }
        }
    }
}
