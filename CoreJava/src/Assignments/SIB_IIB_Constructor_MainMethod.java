package Assignments;

public class Allmethods 
{

	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	Allmethods()
	{
		System.out.println("Constructor");
	}
	void maths()
	{
		System.out.println("Non-static Method");
	}
	
	static void add()
	{
		System.out.println("static Method");
	}
	public static void main(String[] args)
	{
		Allmethods n  =new Allmethods();
		new Allmethods();      //object creation 2nd time to check order of execution
		add();
		n.maths();
		System.out.println("Main Method");

	}

}
