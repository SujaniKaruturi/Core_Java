package Assignments;
//Ass24. Multi Level Inheritance
//A single child is inheriting the property from single parent and single parent is inheriting from single grandfather. 
class School
{
	static void lkg()
	{
		System.out.println("static method of School class");
	}
	void ukg()
	{
		System.out.println("Non-static method of School class");
	}
}
class College extends School
{
	static void first ()
	{
		System.out.println("static method of College class");
	}
	void second()
	{
		System.out.println("Non-static method of College class");
	}
}
public class Asignment24 extends College
{
	static void btech1 ()
	{
		System.out.println("static method of Asignment24 class");
	}
	void btech2()
	{
		System.out.println("Non-static method of Asignment24 class");
	}
	public static void main(String[] args) 
	{
		Asignment24 b=new Asignment24();
		lkg();
		first();
		btech1();
		b.ukg();
		b.second();
		b.btech2();
		

	}

}
