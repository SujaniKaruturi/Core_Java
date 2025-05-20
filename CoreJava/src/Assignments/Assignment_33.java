package Assignments;
//Ass33. 1 Abstract class with 2 Abstract method. 1 Child class with 2 static method and 2 non static method and another one class with 2 static method , 2 non static method
abstract class Parent
{
	abstract void phone();
	abstract void laptop();
}
class Graduate extends Parent
{
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
}

public class Assignment_33 extends Graduate
{
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
		Assignment_33 r=new Assignment_33();
		pen1();
		pencil1();
		r.book1();
		r.page1();
		pen();
		pencil();
		r.book();
		r.page();
		r.phone();
		r.laptop();
	}

}
