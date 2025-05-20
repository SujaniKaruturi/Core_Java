package CodePractice;
//Generally Constructor cannot be inherited,but he output is all 3 constructors output .
//This is because of super calling statement.
class Country
{
	Country(int a)
	{			
		System.out.println("Country Constructor");
	}
}
class State extends Country
{
	State()
	{
		super(4);   //parameterized super calling statement to call Country class constructor
		System.out.println("parameterized super calling statement to call Country class constructor ");
		//System.out.println("State Constructor");
		
	}
}

public class ConstructorCannotBeInherited extends State
{
	ConstructorCannotBeInherited()
	{								
		super();      //non-parameterized super calling statement to call State class constructor
		//even super calling statement is present or not present the output is same because super calling statement is present implicitly.
		System.out.println("non-parameterized super calling statement to call State class constructor");
		//System.out.println("City Constructor");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new State();
		//new ConstructorCannotBeInherited();
	}

}

/* output:
 when we call new ConstructorCannotBeInherited(); in main method then output is: 
Country Constructor
State Constructor
City Constructor
because implicitly super calling statement is present inside every city,state,country constructor.
 */

