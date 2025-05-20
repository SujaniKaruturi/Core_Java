package Assignments;
//Ass_41: Access Specifier Within class 
//All the 4 types of methods can be called i.e default,public,protected,private methods
public class Assignment_41
{
	void add()       //default method
	{
		System.out.println("static method- add");
	}
	public static void subtract()
	{
		System.out.println("static method- subtract");
	}
	protected void division()
	{
		System.out.println("static method- division");
	}
	private static void multiply()
	{
		System.out.println("static method- multiply");
	}
	public static void main(String[] args)
	{
		Assignment_41 f=new Assignment_41();
		f.add();      //Default methods are called using object reference variable
		subtract();
		f.division();
		multiply();

	}

}
