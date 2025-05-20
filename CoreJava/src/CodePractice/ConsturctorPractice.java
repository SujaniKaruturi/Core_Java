package CodePractice;

public class ConsturctorPractice
{
	public static void main(String[] args) 
	{
		ConsturctorPractice c1 = new ConsturctorPractice();   //constructor is been called when object is created.
		c1.add();
		c1.subtract();
		c1.multiple();
		division();
		exponent();
		power();
		ConsturctorPractice c2 = new ConsturctorPractice(); //c2 is not used anywhere
		new ConsturctorPractice();  //another way to create object without reference variable
	}

	ConsturctorPractice() //Default access specifier, non-static method, non-parameterized 
	{
		System.out.println("Constructor is called");
	}
	
	void add()
	{
		System.out.println("non-static method 1");
	}
	static void division()
	{
		System.out.println("static method 1");
	}
	void subtract()
	{
		System.out.println("non-static method 2");
	}
	static void exponent()
	{
		System.out.println("static method 2");
	}
	void multiple()
	{
		System.out.println("non-static method 3");
	}
	static void power()
	{
		System.out.println("static method 3");
	}

	
}
