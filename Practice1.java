import java.util.Scanner;

public class Practice1
{
    public static void main(String[]args)
    {
        int testCases,iterator;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();
        while(testCases-->0)
        {
            boolean flag = true;
            int length = scan.nextInt();
            int []arr = new int[length];
            int fiveCoins=0, tenCoins=0;
            for(iterator=0;iterator<length;iterator++) {
                arr[iterator] = scan.nextInt();
            }
            for(iterator=0;iterator<length;iterator++)
            {
                boolean isWhatever = true;
                if(arr[iterator]==5)
                {
                    fiveCoins++;
                }
                else if(arr[iterator]==10)
                {
                    if(fiveCoins==0)
                    {
                        flag=false;
                        break;
                    }
                    tenCoins++;
                    fiveCoins--;
                }
                else if(arr[iterator]==15)
                {
                    if(tenCoins==0 && (fiveCoins<2))
                    {
                        flag = false;
                        break;
                    }
                    else if(fiveCoins>=2)
                    {
                        fiveCoins-=2;
                        isWhatever = false;
                    }
                    if(isWhatever == false)
                        continue;
                    tenCoins--;
                    fiveCoins++;
                }
            }
            System.out.println(fiveCoins+" "+tenCoins);
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
