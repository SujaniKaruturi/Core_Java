package Assignments;
//Ass 26. Hierarchial level Inheritance
//Multiple childs inherits single parent class
//this case is not practical as we cannot use the child1,child2,child3 methods cannot be used.
class School2   //Parent class
{
	static void lkg()
	{
		System.out.println("static method of School2 class");
	}
	void ukg()
	{
		System.out.println("Non-static method of School2 class");
	}
}
class Child1 extends School2
{
	static void first ()
	{
		System.out.println("static method of Child1 class");
	}
	void second()
	{
		System.out.println("Non-static method of Child1 class");
	}
}
class Child2 extends School2
{
	static void btech1 ()
	{
		System.out.println("static method of Child2 class");
	}
	void btech2()
	{
		System.out.println("Non-static method of Child2 class");
	}
}
class Child3 extends School2
{
	static void btech3 ()
	{
		System.out.println("static method of Child3 class");
	}
	void btech4()
	{
		System.out.println("Non-static method of Child3 class");
	}
}

public class Assignment26 extends School2
{
	static void third()
	{
		System.out.println("static method of Assignment26 class");
	}
	void fourth()
	{
		System.out.println("Non-static method of Assignment26 class");
	}
	public static void main(String[] args) 
	{
		Assignment26 f=new Assignment26();
		f.fourth();
		third();
		f.ukg();
		lkg();
		

	}

}
