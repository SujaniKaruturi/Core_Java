package MKT_Java;
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
/*
	why static methods cannot be overidden? 
	Becoz Static methods do not have any dependency on inheritance concept.  
	As Static methods of same class can be called using method name. 
	Static methods of diff class can be called using classname.methodname. 
	So as inheritance is not applicable to static methods, these cannot be overridden. 
*/
 
}
