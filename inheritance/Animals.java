package inheritance;

class Animal{
void eat() {
System.out.println("Eat");

}
void sleep() {
System.out.println("Sleep");
  }
}

class Bird extends Animal{
void fly() {
System.out.println("Fly");
}
}

public class Animals {
	 public static void main(String[] arg) {
		 Animal A=new Animal();
		 Bird B=new Bird();
		 A.eat();
		 A.sleep();
		 B.fly();
		 B.sleep();
		 B.eat();
		 }
	

}
