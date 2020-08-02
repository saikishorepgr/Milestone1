import java.util.Scanner;

public class Milestone1MockTestQ1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        String inputString = scan.nextLine();
        while(testcase-->0) {
            boolean test = true;
            inputString = scan.nextLine();
            try
            {
                Double aDoubleValue = Double.parseDouble(inputString);
            }
            catch (NumberFormatException e)
            {
                test = false;
            }
            System.out.println(test);
        }
    }
}
