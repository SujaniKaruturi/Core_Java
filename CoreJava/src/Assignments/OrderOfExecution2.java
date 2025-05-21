package Assignments;
//Ass36. 3 SIB,3IIB,1 main method,2 static method,2 non-static method,2 constructors in a class then call it and check the output
//Order of execution when SIb,IIB,main method,constructor are present in same class is SIB,main method,IIB,constructor.
public class OrderOfExecution2
{
	OrderOfExecution2()
	{	
		
		System.out.println("Assignment_36 constructor 1");
	}
	OrderOfExecution2(int a)    //this constructor is not called during the execution.
	{
		System.out.println("Assignment_36 constructor 2");
	}
	static 
	{
		System.out.println("Static Initialization block 1");	
	}
	
	static 
	{
		System.out.println("Static Initialization block 2");
	}
	static 
	{
		System.out.println("Static Initialization block 3");
	}
	//This is IIB,IIB gets executed as soon as we create an object. 
	{
		System.out.println("Instance Initialization block 1");
	}
	{
		System.out.println("Instance Initialization block 2");
	}
	{
		System.out.println("Instance Initialization block 3");
	}
	static void fan()    //static method
	{
		System.out.println("Static method 1");
	}
	static void ac()
	{
		System.out.println("Static method 2");
	}
	void charger()      //non-static method
	{
		System.out.println("Static method 1");
	}
	void spects()
	{
		System.out.println("Static method 1");
	}
	
	public static void main(String[] args) 
	{
		OrderOfExecution2 o=new OrderOfExecution2();
		o.charger();
		o.spects();
		fan();
		ac();
		
		
	}

}

/*output :
Static Initialization block 1
Static Initialization block 2
Static Initialization block 3
Instance Initialization block 1
Instance Initialization block 2
Instance Initialization block 3
Assignment_36 constructor 1
constructor 2 is not getting called here why???????
Static method 1
Static method 1
Static method 1
Static method 2
*/
	
