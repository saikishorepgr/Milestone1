package overriding;


class Fruit
{
	String name , taste;
	int size;
	void eat(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
		System.out.println(name);
	}
	
}
class Apple extends Fruit
{
	void eat(String taste)
	{
		System.out.println(taste);
	}
}
class Orange extends Fruit
{
	void eat(String taste)
	{
		System.out.println(taste);
	}
}


public class Fruits {

	public static void main(String [] args)
	{
		String name=args[0];
		String taste=args[1];
		int size=Integer.parseInt(args[2]);
		String taste_1=args[3];
		String taste_2=args[4];
		Fruit f=new Fruit();
		Apple a=new Apple();
		Orange o=new Orange();	
		f.eat(name,taste,size);
		a.eat(taste_1);
		o.eat(taste_2);			
	}	
}