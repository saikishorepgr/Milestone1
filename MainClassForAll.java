public class MainClassForAll
{

    /* This is for Factorial Class
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scan.nextInt();
        scan.close();
        Factorial factorial = new Factorial();
        System.out.println("The factorial of "+number+" is "+factorial.factorial(number));
    }
    */

    /* This is main method for SumEqualsSpecifiedNumber Class
    public static void main(String []args)
    {
        int number,length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        length = scan.nextInt();
        System.out.println("Enter the array elements: ");
        int iterator;
        int [] arr = new int[length];
        for(iterator=0;iterator<length;iterator++)
        {
            arr[iterator] = scan.nextInt();
        }
        System.out.println("Enter the key or the sum: ");
        number = scan.nextInt();
        SumEqualsSpecifiedNumber s = new SumEqualsSpecifiedNumber();
        s.sumEqualsSpecifiedNumber(number,arr);
    }
     */
}
