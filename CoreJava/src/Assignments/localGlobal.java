package Assignments;
/*
 Ass20. Check default value of all data types for global variable
 Ass21. Create local and global variable and access them inside main method
 Ass22. create static and non static global variables and access them inside main method
 */
public class localGlobal 
{
	int a;
	//a=100; //global variable declaration first and then initialize in next line is not possible
	//Initialization to global variable can be done inside the method
	double b;    //default value
	float c;
	String d;   // default value
	byte e;
	char f;
	boolean g;
	int h=800;    //non-static global variable
	static int k=90;    //static global variable
	
	void method1()
	{
		double i;
		i = 5.5;
		 //static int h;  //local variable cannot be static and non-static
		a = 89; //Initialization of global variable inside method1
		System.out.println("global varaibles in a method1 after initialzed value is "+a);
		System.out.println("local varaibles in a method value is "+i);
		System.out.println("global varaibles in a method1 value is "+k); 
		System.out.println("global varaibles in a method1 value is "+d); 
		
	}
	static void method2()
	{
		k =156; ////Initialization of global variable inside method2
		System.out.println("global varaibles in a method2 after initialzed value is "+k);
		 
	}
	
	
	public static void main(String[] args) 
	{
		int j =987;
		k = 56;
		System.out.println("local varaible inside main method value is: " + j);
		localGlobal dv = new localGlobal();
		System.out.println("Boolean default value is: " + dv.g);  
		System.out.println("Double default value is: " + dv.b);
		System.out.println("Float default value is: " + dv.c);
		System.out.println("String default value is: " + dv.d);
		System.out.println("Byte default value is: " + dv.e);
		System.out.println("Char default value is: " + dv.f);
		System.out.println("Boolean default value is: " + dv.g);
		System.out.println("non-static Global variable is accessed inside main method " + dv.h); //accessing global variable
		System.out.println("static value of global variable is : " + k);
		dv.method1(); //accessing local variable
		method2();
	}

}
