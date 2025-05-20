package Assignments;
//Ass 45.Call 10 constructors in a class using this calling statement
//one class has 10 constructor, how many objects should we create to call all constructor.
//Answer :We need 10 objects,so memory is occupied more.

//To overcome above issue ,this calling statement is used.

//This calling statement: Used to call from one constructor to another constructor. This calling statement should be written in first line of constructor.
public class Assignment_45 
{
	Assignment_45()
	{
		this("hi");
		System.out.println("Non-parametirized constructor");
	}
	Assignment_45(int a)
	{
		System.out.println("parametirized constructor with int data type ");
	}
	Assignment_45(int a,double b)
	{	
		this("School",true,45.678);
		System.out.println("parametirized constructor with int,double data type ");
	}
	Assignment_45(String h)
	{	
		this(89,78.869);
		System.out.println("parametirized constructor with String data type ");
	}
	Assignment_45(String t,boolean y)
	{
		System.out.println("parametirized constructor with String,boolean data type ");
	}
	Assignment_45(int a,float k)
	{
		System.out.println("parametirized constructor with int,float data type ");
	}
	Assignment_45(int a,String o,boolean i)
	{
		System.out.println("parametirized constructor with int,String,boolean data type ");
	}
	Assignment_45(String i,boolean f,double y)
	{
		System.out.println("parametirized constructor with String,boolean,double data type ");
	}
	Assignment_45(float a)
	{
		System.out.println("parametirized constructor with float data type ");
	}
	Assignment_45(boolean a)
	{
		System.out.println("parametirized constructor with boolean data type ");
	}
	public static void main(String[] args)
	{
		Assignment_45 g= new Assignment_45();

	}

}
