package Assignments;
//Assignment_15 also
/*
 Ass9. Call non-static method
 Ass10. Create 3 static,3 non static,1 constructor inside single class
		and try to call non_static,static and then constructor respectively. 
		Observe the behavior.
 Ass15. Call constructor in main method
 */
public class Assignment_9_10
{

	public static void main(String[] args) 
	{

		Assignment_9_10 c1 = new Assignment_9_10();   //constructor is been called when object is created.
		c1.add();
		c1.subtract();
		c1.multiple();
		division();
		exponent();
		power();
		Assignment_9_10 c2 = new Assignment_9_10(); //Caling constructor in main method
	}

	Assignment_9_10() //Default access specifier, non-static method, non-parameterized 
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

