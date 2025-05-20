package CodePractice;

public class Nonstatic 
{
	
	void subtract()
	{
		System.out.println("non-static method");
	}
	void multiple()
	{
		System.out.println("non-static method 2");
	}
	static void add()
	{
		System.out.println("static method");
	}
	
	public static void main(String[] args)
	{
		add();  //Static Method
		Nonstatic N1 = new Nonstatic();     //Object creation for Non-static Method
		N1.subtract();
		N1.multiple();

	}

}
