package Assignments;

import CodePractice.Assignment_43_Parentclass;

//Ass_42: Accessspecifiers:outside the  package by becoming subclass
//Type 1: Package1 --->class A, Package2---> class B ,both classes in 2 different java files,so we need to import the package
//1. Here Corejava package----> Assignment_43_Parentclass is a class ,
//2. Assignments package---> Assignemnt_43 is a class where PSVM() is present,so we need to import Corejava package into Assignments package.
//3. to make the Assignemnt_43 as subclass we need to inherit Assignment_43_Parentclass class using extends keyword.
//4. public class Assignment_43_Parentclass extends Assignment_43
public class Assignment_43 extends Assignment_43_Parentclass
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
		Assignment_43 e =new Assignment_43();
		//e.pen();	//default method is not accessible
		pencil();	//static method is called directly if the method is present in same class
		//static method are called using class name when static method are present in different class
		e.eraser();	//protected method 
		//sharpner();	//private method cannot be called
		
	}

}
