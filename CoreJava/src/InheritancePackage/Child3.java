package InheritancePackage;

public class Child3 extends ParentClass
{
	static void btech3 ()
	{
		System.out.println("static method of Child3 class");
	}
	void btech4()
	{
		System.out.println("Non-static method of Child3 class");
	}
	public static void main(String[] args) 
	{
		Child3 c=new Child3();
		c.btech4();
		btech3();
		lkg();
		c.ukg();
		

	}

}
