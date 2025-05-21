package Assignments;
//Ass30. Calling the Overridden method using Super Keyword
class Parent_5
{
	void bottle()
	{
		int c=30;
		int d=48;
		System.out.println("Addition of 2 numbers is " + (c+d)); //addition
	}
}
public class Assignment30 extends Parent_5
{
	void bottle()    //method overriding
	{
		super.bottle();  //super keyword can be only used in non-static methods,used to call methods from parent class.
		int e=100;
		int f=5;
		System.out.println("Division of 2 numbers is " + (e/f));
	}
	public static void main(String[] args) 
	{
		Assignment30 p=new Assignment30();
		p.bottle();

	}

}
