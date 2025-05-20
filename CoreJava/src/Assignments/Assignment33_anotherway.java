package Assignments;
//Ass33. 1 Abstract class with 2 Abstract method. 1 Child class with 2 static method and 2 non static method and another one class with 2 static method , 2 non static method
abstract class Parent9
{
	abstract void phone();
	abstract void laptop();
}
abstract class Graduate2 extends Parent   //as methods phone,laptop are overridden in class Assignment33_anotherway we need to make Graduate2 class as abstract class
{											//phone,laptop methods can be defined in Graduate2 class as well instead of Assignment33_anotherway,as Graduate2 extends Parent.
	static void pen()
	{
		System.out.println("pen method of Child1 Class");
	}
	static void pencil()
	{
		System.out.println("pencil method of Child1 Class");
	}
	void book()
	{
		System.out.println("book method of Child1 Class");
	}
	void page()
	{
		System.out.println("page method of Child1 Class");
	}
	
}
public class Assignment33_anotherway extends Graduate2
{
	@Override
	void phone()
	{
		System.out.println("phone method of abstract Class Parent");
		
	}
	@Override
	void laptop()
	{
		System.out.println("laptop method of abstract Class Parent");
		
	}
	static void pen1()
	{
		System.out.println("pen method of Assignment_33 Class");
	}
	static void pencil1()
	{
		System.out.println("pencil method of Assignment_33 Class");
	}
	void book1()
	{
		System.out.println("book method of Assignment_33 Class");
	}
	void page1()
	{
		System.out.println("page method of Assignment_33 Class");
	}
	public static void main(String[] args)
	{

		Assignment33_anotherway h= new Assignment33_anotherway();
		h.phone();
		h.laptop();
		pen();
		pen1();
		pencil();
		pencil1();
		h.book();
		h.book1();
		h.page1();
		

	}

}
