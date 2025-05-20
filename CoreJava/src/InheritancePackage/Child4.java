package InheritancePackage;

public class Child4 extends ParentClass
{
	static void third()
	{
		System.out.println("static method of Child4 class");
	}
	void fourth()
	{
		System.out.println("Non-static method of Child4 class");
	}
	public static void main(String[] args) 
	{
		Child4 c=new Child4();
		c.fourth();
		third();
		lkg();
		c.ukg();
		

	}

}
