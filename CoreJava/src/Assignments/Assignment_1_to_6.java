package Assignments;
/*
 1. Print your name
 2. Declare,initialize all data type and print them.
 3. Addition,Subtraction,Division,Multiplication Program.
 
 */
public class Assignment_1_to_6 
{
	void add()
	{
		int c=30;
		int d=48;
		float f =9.78f;
		double g=5.678;
		System.out.println(f);
		System.out.println(g);
		System.out.println("Addition of 2 numbers is " + (c+d));
	}
	void subtract(int e,int f)
	{
		System.out.println("Subtraction of 2 numbers is " + (e-f));
	}
	void multiple()
	{
		int g=7;
		int h=90;
		int c=g*h;
		System.out.println("Multiplication of 2 numbers is " + c);
	}
	void division(int e,int f)
	{
		e=100;
		f=5;
		System.out.println("Division of 2 numbers is " + (e/f));
	}
	public static void main(String[] args) 
	{
		int b=200;
		System.out.println("Sujani");
		System.out.println("Value of b is " + b);
		Assignment_1_to_6 a=new Assignment_1_to_6();
		a.add();
		
		//a.subtract(476,245);
		//a.multiple();
		//a.division(500,10);
	}

}
