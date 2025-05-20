package InheritancePackage;

public class Child2 extends ParentClass
{
	static void btech1 ()
	{
		System.out.println("static method of Child2 class");
	}
	void btech2()
	{
		System.out.println("Non-static method of Child2 class");
	}
	public static void main(String[] args)
	{

		Child2 c=new Child2();
		c.btech2();
		btech1();
		lkg();
		c.ukg();
		
	}

}
