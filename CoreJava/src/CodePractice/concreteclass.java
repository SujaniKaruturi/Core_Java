package CodePractice;

abstract class abstactClass   //parent class
{
	abstract void add();  
	//abstract method doen't have a body/implementation and should start with abstract keyword and end with ;
	
}
public class concreteclass extends abstactClass//child class
{
	void add()     
	//concrete class have a body/implementation 
	//method overriding is been used for method add which is a non-static method.
	{
		int a=20;
		int b=90;
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		concreteclass c= new concreteclass();
		c.add();
		
	}

}
