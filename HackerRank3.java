import java.util.Scanner;

public class HackerRank3
{
    static boolean validateAlphabets(String a)
    {
        int i;
        a = a.toLowerCase();
        for(i=0;i<a.length();i++)
        {
            if(!(a.charAt(i)>='a'&& a.charAt(i)<='z'))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int pin;
        int n,i;
        String finalPin = "";
        Scanner scan = new Scanner(System.in);
        firstName = scan.next();
        lastName = scan.next();
        pin = scan.nextInt();
        n = scan.nextInt();
        String pinString = Integer.toString(pin);
        String shortName, longName;
        if(!(validateAlphabets(firstName)) || !(validateAlphabets(lastName)))
        {
            System.out.println("INVALID INPUT");
        }
        else if(pinString.length()!=6)
        {
            System.out.println("INVALID PIN");
        }
        else if(n>6 || n<1)
        {
            System.out.println("INVALID RANGE");
        }
        else
        {
            if(firstName.length()>lastName.length())
            {
                longName = firstName;
                shortName = lastName;
            }
            else if(lastName.length()>firstName.length())
            {
                longName = lastName;
                shortName = firstName;
            }
            else
            {
                if(firstName.charAt(0)>lastName.charAt(0))
                {
                    longName = firstName;
                    shortName = lastName;
                }
                else
                {
                    longName = lastName;
                    shortName = firstName;
                }
            }
            if(longName.length()%2!=0)
            {
                finalPin = finalPin + longName.charAt((longName.length()/2));
            }
            else
            {
                finalPin = finalPin + longName.charAt(0);
            }
            StringBuffer shortNameBuffer = new StringBuffer(shortName);
            if(shortName.length()%2==0)
            {
                finalPin = finalPin + shortNameBuffer.reverse();
            }
            else
            {
                finalPin = finalPin + shortName;
            }
            String tempPIN = Integer.toString(pin);
            finalPin = finalPin + tempPIN.charAt(n-1) + tempPIN.charAt(6-n);
            System.out.println(finalPin);
            if(finalPin.length()<6)
            {
                System.out.println("INVALID PIN");
            }
            else
            {
                StringBuffer stringBuffer = new StringBuffer(finalPin);
                for(i=0;i<stringBuffer.length();i++)
                {
                    Character character = stringBuffer.charAt(i);
                    if(Character.isUpperCase(character))
                    {
                        stringBuffer.replace(i,i+1,Character.toLowerCase(character)+"");
                    }
                    else
                    {
                        stringBuffer.replace(i,i+1,Character.toUpperCase(character)+"");
                    }
                }
                finalPin = new String(stringBuffer);
                System.out.println(finalPin);
            }
        }
    }
}
