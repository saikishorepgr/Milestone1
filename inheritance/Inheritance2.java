package inheritance;

class Employee extends Person{
double salary;
int year;
String insnum;
public  void setsalary(double salary){
this.salary=salary;
}
public void setjoinyear(int year){
this.year=year;
}
public void setid(String insnum){
this.insnum=insnum;
}
public double getsalary(){
return salary;
}
public int getjoinyear(){
return year;
}
public String getid(){
return insnum;
}
}


public class Inheritance2 {
	public static void main(String args[]){
		String name=args[0];
		double salary=Double.parseDouble(args[1]);
		int year=Integer.parseInt(args[2]);
		String insnum=args[3];
		Employee e=new Employee();
		e.setname(name);
		e.setsalary(salary);
		e.setjoinyear(year);
		e.setid(insnum);
		System.out.println("Name of the Employee: "+e.getname());
		System.out.println("Salary per month: "+e.getsalary());
		System.out.println("Joining year of the Employee: "+e.getjoinyear());
		System.out.println("Employee's National Insurance Number: "+e.getid());
		}
		}
