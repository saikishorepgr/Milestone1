package class_and_objects;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(NewCalculator.powerDouble(13.89,4));
		System.out.println(NewCalculator.powerInt(16,8));	
	}
}
class NewCalculator
{
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1, num2);
	}
}
