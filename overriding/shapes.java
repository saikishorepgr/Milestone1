package overriding;


class Shape
{
	void draw()
	{
		System.out.println("Drawing Shape");	
	}
	void erase()
	{
		System.out.println("Erasing shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");	
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");	
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	} 
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");	
	}
	void erase()
	{
		System.out.println("Erasing Square");
	} 
}

	
public class shapes {
	public static void main(String [] args)
	{
		Shape s=new Shape();
		Circle c=new Circle();
		Square q=new Square();
		Triangle t=new Triangle();
		s.draw();
		s.erase();
		c.draw();
		c.erase();
		q.draw();
		q.erase();
		t.draw();
		t.erase();
	}	

}


