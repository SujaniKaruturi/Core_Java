package Assignments;
//Ass25. Multiple level Inheritance is not possible in java.
//child class inheriting properties of 1 or more parent class.
class School1
{
	static void lkg()
	{
		System.out.println("static method of School class");
	}
	void ukg()
	{
		System.out.println("Non-static method of School class");
	}
}
class College1 
{
	static void first ()
	{
		System.out.println("static method of College class");
	}
	void second()
	{
		System.out.println("Non-static method of College class");
	}
}
public class Assignment25
//public class Assignment25 extends College1 extends School1
//public class Assignment25 extends College,School   // this  is not possible
{

	static void btech1 ()
	{
		System.out.println("static method of Asignment24 class");
	}
	void btech2()
	{
		System.out.println("Non-static method of Asignment24 class");
	}
	public static void main(String[] args) 
	{
		Assignment25 c=new Assignment25();
		//lkg();
		//first();
		btech1();
		//c.ukg();
		//c.second();
		c.btech2();
		
		

	}

}
