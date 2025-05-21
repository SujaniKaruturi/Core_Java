package Assignments;
//Ass23. Single level Inheritance

class singleParent
{
	static void school()
	{
		System.out.println("static method of Parent class");
	}
	void add()
	{
		System.out.println("Non-static method of Parent class");
	}
}
public class Assignment23 extends singleParent
{
	static void college()
	{
		System.out.println("static method of child class");
	}
	void hello()
	{
		System.out.println("Non-static method of Child class");
	}
	public static void main(String[] args) 
	{
		Assignment23 a= new Assignment23();
		a.add();
		a.hello();
		school();
		college();
		
		

	}

}
