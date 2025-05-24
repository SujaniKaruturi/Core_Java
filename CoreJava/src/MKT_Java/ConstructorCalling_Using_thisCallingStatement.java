package MKT_Java;
//Ass 45.Call 10 constructors in a class using this calling statement
//one class has 10 constructor, how many objects should we create to call all constructor.
//Answer :We need 10 objects,so memory is occupied more.

//To overcome above issue ,this calling statement is used.

//This calling statement: Used to call from one constructor to another constructor. This calling statement should be written in first line of constructor.
public class ConstructorCalling_Using_thisCallingStatement
{
	ConstructorCalling_Using_thisCallingStatement()
	{
		this("hi");
		System.out.println("Non-parametirized constructor");
	}
	ConstructorCalling_Using_thisCallingStatement(int a)
	{
		System.out.println("parametirized constructor with int data type ");
	}
	ConstructorCalling_Using_thisCallingStatement(int a,double b)
	{	
		this("School",true,45.678);
		System.out.println("parametirized constructor with int,double data type ");
	}
	ConstructorCalling_Using_thisCallingStatement(String h)
	{	
		this(89,78.869);
		System.out.println("parametirized constructor with String data type ");
	}
	ConstructorCalling_Using_thisCallingStatement(String t,boolean y)
	{
		System.out.println("parametirized constructor with String,boolean data type ");
	}
	ConstructorCalling_Using_thisCallingStatement(int a,float k)
	{
		System.out.println("parametirized constructor with int,float data type ");
	}
	ConstructorCalling_Using_thisCallingStatement(int a,String o,boolean i)
	{
		System.out.println("parametirized constructor with int,String,boolean data type ");
	}
	ConstructorCalling_Using_thisCallingStatement(String i,boolean f,double y)
	{
		System.out.println("parametirized constructor with String,boolean,double data type ");
	}
	ConstructorCalling_Using_thisCallingStatement(float a)
	{
		System.out.println("parametirized constructor with float data type ");
	}
	ConstructorCalling_Using_thisCallingStatement(boolean a)
	{
		System.out.println("parametirized constructor with boolean data type ");
	}
	public static void main(String[] args)
	{
		ConstructorCalling_Using_thisCallingStatement g= new ConstructorCalling_Using_thisCallingStatement();

	}

}
