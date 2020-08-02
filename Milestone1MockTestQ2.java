import java.util.Scanner;

public class Milestone1MockTestQ2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();                            //man, took length here
        int i,j;
        String input,inputTempString = "";                      //unnecessary
        for(i=0;i<length;i++)
        {
            input = scan.next();
            inputTempString = inputTempString + input;
        }
        char[] charArray = inputTempString.toCharArray();
        int[] intArray = new int[charArray.length];
        for(i=0;i<charArray.length;i++)
        {
            intArray[i] = charArray[i]-'0';                     //converted char to integer
        }
        for(i=0;i<charArray.length-1;i++)
        {
            for(j=i+1;j<charArray.length;j++)
            {
                if(intArray[i]<intArray[j])
                {
                    int temp;
                    temp = intArray[i];
                    intArray[i] = intArray[j];                  //swapped to sort array
                    intArray[j] = temp;
                }
            }
        }
        int number=0;
        for(i=charArray.length-1;i>=0;i--)
        {
            //System.out.print(intArray[i] +" * "+ ((int)Math.pow(10,charArray.length-i-1)) + " = ");
            number += intArray[i]*(int)Math.pow(10,charArray.length-i-1);
            //System.out.println(number);
        }
        System.out.println(number);
    }
}
