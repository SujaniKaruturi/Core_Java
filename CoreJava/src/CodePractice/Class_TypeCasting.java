package CodePractice;

class Google_Class
{
	void add()
	{
		System.out.println("Google_Class add method");
		
	}
	void subtract()
	{
		System.out.println("Google_Class subtract method");
		
	}
}
public class Class_TypeCasting extends Google_Class
{

	void multiply()
	{
		System.out.println("Class_TypeCasting multiply method");
		
	}
	void divide()
	{
		System.out.println("Class_TypeCasting divide method");
		
	}
	public static void main(String[] args)
	{
		Google_Class g =new Class_TypeCasting();  //upcasting,implicit way
		//this concept is useful to lauch diff browsers in framework class,we get better understnading there.
		g.add();
		g.subtract();
		//g.multiply();		//with the help of g,we cannot access child class methods.
		//g.divide();		//with the help of g,we cannot access child class methods.

	}

}
