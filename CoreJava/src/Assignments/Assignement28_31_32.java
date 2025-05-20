package Assignments;
//Ass28. Create one child class and two abstract class and add 2  Abstract method in both abstract class 
//Ass31. Abstract class with concrete and abstract methods
//Ass32. Create 2 Abstract class with both having 2 Abstract methods, and a main class and call all the 4 methods
abstract class Class_Abstart
{
	 abstract void street();
	 abstract void glass();
	 static void food()
	 {
		 System.out.println("static method of Class_Abstart class");
	 }
	 
}
abstract class Class_Abstart2 extends Class_Abstart
{
	 abstract void bottle();
	 abstract void road();
	 void car()
	 {
		 System.out.println("non-static method of Class_Abstart2 class"); 
	 }
}
public class Assignement28_31_32 extends Class_Abstart2
{
	void plank()
	{
		int e=100;
		int f=5;
		System.out.println("Division of 2 numbers is of child class " + (e/f));
	}
	static void book()
	{
		
		System.out.println("static method of child class");
	}
	void street()
	{
		System.out.println("Street method of Class_Abstart class ");
	}
	void glass()
	{
		System.out.println("glass method of Class_Abstart class ");
	}
	void bottle()
	{
		System.out.println("bottle method of Class_Abstart2 class ");
	}
	void road()
	{
		System.out.println("road method of Class_Abstart2 class ");
	}
	public static void main(String[] args)
	{
		Assignement28_31_32 w=new Assignement28_31_32();
		w.street();
		w.bottle();
		w.road();
		w.glass();
		w.plank();
		book();
		w.car();
		food();
	}

}
