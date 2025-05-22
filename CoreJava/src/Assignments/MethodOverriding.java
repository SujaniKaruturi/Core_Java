package Assignments;
//Ass29. Method Overriding
class Parent_4
why static methods cannot be overridden
{
	static void bottle()
	{
		int c=30;
		int d=48;
		System.out.println("Addition of 2 numbers is " + (c+d)); //addition
	}
	void glass()
	{
		System.out.println("parent class non-static method" );
	}
}
public class MethodOverriding extends Parent_4
{
	static void bottle()
	{
		//super.bottle();  //super keyword cannot be used in static methods
		int e=100;
		int f=5;
		System.out.println("Division of 2 numbers is " + (e/f));
	}
	void glass()
	{
		System.out.println("child class non-static method" );
		//super.glass();     //Super keyword will help us to get the parent class implementation together with the child class implementation. 
	}
	public static void main(String[] args) 
	{
		MethodOverriding l=new MethodOverriding();
		l.glass();
		bottle();   //output will be child class method output ,where parent class method is been over ridden

	}

}
