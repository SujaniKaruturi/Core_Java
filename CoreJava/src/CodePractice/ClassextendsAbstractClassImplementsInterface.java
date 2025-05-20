package CodePractice;
interface Second
{
	void interfacemethod();   //abstract method in interface ,with no abstract keyword
	
}

abstract class ABClass implements Second
{
	abstract void abstractmethod();  //abstract method
	void abstractmethod2()
	{
		System.out.println("abstractmethod2 of abstract class");
	}
}
public class ClassextendsAbstractClassImplementsInterface  extends ABClass
{

	public static void main(String[] args)
	{
		ClassextendsAbstractClassImplementsInterface h =new ClassextendsAbstractClassImplementsInterface();
		h.interfacemethod();
		h.abstractmethod();
		h.abstractmethod2();
		h.abstractmethod4();
		abstractmethod3();
	}
	static void abstractmethod3()
	{
		System.out.println("static abstractmethod3 of child class");
	}
	void abstractmethod4()
	{
		System.out.println("non-static abstractmethod4 of child class");
	}

	@Override
	public void interfacemethod()
	{
		System.out.println("interfacemethod of interface");
		
	}

	@Override
	void abstractmethod() 
	{
		
		System.out.println("abstractmethod of abstract class");
	}

}
