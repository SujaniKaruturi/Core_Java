package Assignments;
//Ass_42: accessspecifiers - within the package having more than one class  
//Type1: Package1 --->class A, Package2---> class B ,both classes in 2 different java files
//Type2: Package1 --> Class A, class B both in one .java file

class A
{
	void add()       //default method
	{
		System.out.println("Default :non-static method- add");
	}
	public static void subtract()
	{
		System.out.println("public: static method- subtract");
	}
	private void division()
	{
		System.out.println("private: non-static method- division");
	}
	protected static void multiply()
	{
		System.out.println("protected: static method- multiply");
	}
}
public class Assignment_42      //No relation between class A and class Assignment_42
{
	void pen()       //default method
	{
		System.out.println("Default: non-static method- pen");
	}
	public static void pencil()
	{
		System.out.println("public: static method- pencil");
	}
	protected void eraser()
	{
		System.out.println("protected:non-static method- eraser");
	}
	private static void sharpner()
	{
		System.out.println("private:static method of child class with no relation with parent class can be accessed - sharpner");
	}
	public static void main(String[] args)
	{
		A a=new A();
		a.add();    //Default methods can be accessed using object reference variable
		A.subtract();  //subtract method from another class can be called using class name
		//static method is called directly if the method is present in same class
		//static method are called using class name or object reference variable as well when static method are present in different class and no relation between 2 classes.
		
		//a.division();  //private methods cannot be accessed with in package but diff class
	
		A.multiply();
		Assignment_42 f =new Assignment_42();
		f.pen();
		pencil();
		f.eraser();
		sharpner();
		
	}

}
