package Assignments;
//Ass 38.non-parameterized super calling statement 
//Ass39. parameterized super calling statement 
class Elder
{
	Elder()
	{
		System.out.println("non-parametirized Constructor of Elder class");
	}
	Elder(int a,double j,boolean y)
	{
		System.out.println("Parametirized Constructor of Elder class");
	}
	static void didi()
	{
		System.out.println("didi static method of Elder class");
	}
	void babi()
	{
		System.out.println("babi non-static method of Elder class");
	}
}
class Younger extends Elder
{
	Younger()
	{
		super(1,56.0,false);   //Explicitly calling parameterized Elder class constructor using parameterized super calling statement.
		//super();   //Explicitly calling non-parameterized Elder class constructor using non-parameterized super calling statement.
		
		System.out.println("Constructor of Younger class");
	}
	static void jiju()
	{
		System.out.println("jiju static method of Younger class");
	}
	void bhai()
	{
		System.out.println("bhai non-static method of Younger class");
	}
}
public class Assignment38_39 extends Younger
{

	public static void main(String[] args)
	{
		//object v is calling both Elder,Younger constructors implicitly.(non-para Super calling statement is already existing implicitly)
		Assignment38_39 v =new Assignment38_39();   
		v.babi();
		v.bhai();
		didi();
		jiju();
	}

}
