package abstraction;

abstract class Compartment1 

{
	  abstract void notice();
}
class FirstClass extends Compartment1
{
	void notice()
	{
		System.out.println("This is Firstclass compartment");
		}
	}
class Ladies extends Compartment1
{
	void notice()
	 
{
		System.out.println("This is LADIES Compartment");
		}
	}
class General extends Compartment1
{
	void notice()
	{
		System.out.println("this is GENERAL Compartment");
		}
	}
class Luggage extends Compartment1
{
	void notice()
	{
		System.out.println("this is LUGGAGE department");
		}
	}
public class Compartment
{
	public static void main(String[] args)
	{
		Compartment1 c[] = new Compartment1[10];
		double i = Math.random()*5;
		int x = (int)i;
		System.out.println(x);
		switch(x)
		{
		case 1: c[0] = new FirstClass();
		c[0].notice();
		break;
		case 2: c[1] = new Ladies();
		c[1].notice();
		break;
 

		case 3: c[2] = new General();
		c[2].notice();
		break;
		case 4: c[3] = new Luggage();
		c[3].notice();
		break;
		default: System.out.println("Invalid Choice");
		}
		}
	}