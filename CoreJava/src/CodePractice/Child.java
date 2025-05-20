package CodePractice;

class Gfather
{
	static void apple()
	{
		System.out.println("Gfather class static method");
	}
	void apples()
	{
		System.out.println("Gfather class non-static method");
	}
}
abstract class Ppparent extends Gfather
{
	abstract void mango();
	static void grape()
	{
		System.out.println("abstract class static method");
	}
	void grapes()
	{
		System.out.println("abstract class non-static method");
	}
}
public class Child extends Ppparent
{
	static void guava()
	{
		System.out.println("child class static method");
	}
	void guavas()
	{
		System.out.println("child class non-static method");
	}
	@Override
	void mango()
	{
		System.out.println("abstract class abstract method mango defnition");
		
	}

	public static void main(String[] args) 
	{
		Child c =new Child();
		guava();
		c.guavas();
		grape();
		c.grapes();
		apple();
		c.apples();
		c.mango();

	}
	
}
