package InheritancePackage;

public class Child1 extends ParentClass
{
	static void first ()
	{
		System.out.println("static method of Child1 class");
	}
	void second()
	{
		System.out.println("Non-static method of Child1 class");
	}
	public static void main(String[] args)
	{
		Child1 c=new Child1();
		c.second();
		first();
		lkg();
		c.ukg();
		

	}

}
