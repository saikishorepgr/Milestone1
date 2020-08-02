import java.util.Scanner;

public class Practice
{
    public static void main(String []args)
    {
        int t,i,c;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        while (t-->0)
        {
            c=0;
            String a = scan.next();
            for(i=0;i<a.length()-1;i++)
            {
                if((a.charAt(i)=='x' && a.charAt(i+1)=='y')||(a.charAt(i+1)=='x' && a.charAt(i)=='y'))
                {
                    c++;
                    i++;
                }
            }
            System.out.println(c);
        }
    }
}
