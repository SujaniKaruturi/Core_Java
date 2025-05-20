package Assignments;

public class OrderofExecution
{
	static
	{
		System.out.println("SIB");
	}
	static
	{
		System.out.println("SIB2");
	}
	static                 //multiple SIB's are possible
	{
		System.out.println("SIB3");
	}
	static
	{
		System.out.println("SIB4");
	}
	{
		System.out.println("IIB");
	}
	{                                          //Multiple IIB is possible,order is first come first serve ,sequential
		System.out.println("IIB1");    
	}
	{
		System.out.println("IIB2");
	}
	{
		System.out.println("IIB3");
	}
	{
		System.out.println("IIB4");
	}
	
	OrderofExecution()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args)
	{
		//System.out.println("main method");
		new OrderofExecution();
		
		System.out.println("main method");

	}

}


/*output:
SIB
IIB
constructor
main method
 
 order of execution is always -->SIB,main method,IIB,constructor*/