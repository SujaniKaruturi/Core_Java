package CodePractice;
class Parents
{
	void add()
	{
		System.out.println("Parent class method:add is called by using super keyword");
	}
	static void adds()
	{
		System.out.println("Parent class method: adds is called by using super keyword");
	}
}
public class Overriding_n_super_keyword extends Parents
{
	void add()
	{
		super.add();   //super keyword can be called at any line of child method
		System.out.println("child class method is called");
		super.add(); 
	}
	static void adds()
	{
		System.out.println("child class method: adds is called ");
	}
	
	public static void main(String[] args) 
	{
		Overriding_n_super_keyword k =new Overriding_n_super_keyword();
		k.add();
		adds();

	}

}
