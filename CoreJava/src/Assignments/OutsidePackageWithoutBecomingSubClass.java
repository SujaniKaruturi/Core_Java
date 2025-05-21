package Assignments;

import CodePractice.Assignment_44_ParentClass;

//Ass 44:outside the package without becoming subclass
//when class is final then no inheritance is possible,so relation is created/not possible
//no need to import Assignment_44_Parentclass,no need to use extends keyword as well
//If no relation is present between 2 classes,classA & classB :where PSVM() is present in class B,need to import class A
//then we can access the non-static method of any class from class B using object reference variable of class A
public class Assignment_44
{
	void add()       //default method
	{
		System.out.println("static method- add");
	}
	public static void subtract()
	{
		System.out.println("static method- subtract");
	}
	private void division()
	{
		System.out.println("static method- division");
	}
	protected static void multiply()
	{
		System.out.println("static method- multiply");
	}
	public static void main(String[] args)
	{
		Assignment_44_ParentClass h =new Assignment_44_ParentClass();
		//h.pen(); //Default methods are not accessible
		//static method is called directly if the method is present in same class
		//static method are called using class name when static method are present in different class
		Assignment_44_ParentClass.pencil(); 
		
		//h.eraser();	//Protected methods are not accessible
		//sharpner();	//Private methods are not accessible
		Assignment_44 k=new Assignment_44();
		k.add();
		subtract();
		k.division();
		multiply();
		
		
	}

}
