package MKT_Java;

class Parent_1   //Parent class
{
	static void lkg()
	{
		System.out.println("static method of Parent_1 class");
	}
	void ukg()
	{
		System.out.println("Non-static method of Parent_1 class");
	}
}
class Child_1 extends Parent_1   //Single Level Inheritance
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
public class MultiLevelInheritance extends Child_1   //Multi Level Inheritance
{
	static void btech3 ()
	{
		System.out.println("static method of Child2 class");
	}
	void btech4()
	{
		System.out.println("Non-static method of Child2 class");
	}
	
	public static void main(String[] args) 
	{
		
		MultiLevelInheritance f=new MultiLevelInheritance();
		btech3();
		first();
		lkg();
		f.btech4();
		f.second();
		f.ukg();
		
		
	}
}

