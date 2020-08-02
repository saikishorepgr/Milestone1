package encapsulation_and_abstraction;

class Author{
	public static String name,email;
	public static char gender;
	Author(String n,String e,char g){
		name=n;
		email=e;
		gender=g;
	}
}
class Book{
	String name1,author1;
	double price;
	int qtyInStock;
	Book(String n1)
	{
		name1 = n1;
	}
	void setqtyInStock()
	{
		qtyInStock=10;
	}
	void setPrice()
	{
		price=100.0;
	}
	double getPrice()
	{
		return price;
	}
	int getqtyInStock()
	{
		return qtyInStock;
	}
	String getName()
	{
		return name1;
	}
	void getAuthor()
	{
		System.out.println("Author:"+Author.name);
		System.out.println("Mail Id:"+Author.email);
		System.out.println("Gender:"+Author.gender);
	}
}


public class Ecapsulation {
	public static void main(String args[]) {
		Book b=new Book("Basics of java");
	Author a=new Author("Kishore","kishore@gmail.com",'M');
		b.setPrice();
		b.setqtyInStock();
		System.out.println("The Book name is :"+b.getName());
		System.out.println("The Price of the Book is:"+b.getPrice());
		System.out.println("The stock is:"+b.getqtyInStock());
		b.getAuthor();
	}

}
