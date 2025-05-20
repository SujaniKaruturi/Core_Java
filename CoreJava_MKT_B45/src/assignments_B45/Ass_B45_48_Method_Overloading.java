package assignments_B45;

public class Ass_B45_48_Method_Overloading {

	public void overload()
	{
		System.out.println("Method oeverloading 1" );
	}
	public void overload(int a,String b)
	{
		System.out.println("Method oeverloading of int ,String" );
	}
	/*
	public void overload(int b,String a)	//Order of datatypes should not be same even when variable names are diff
	{
		System.out.println("Method oeverloading 2" );
	}
	*/
	
	public void overload(String b,int a) 	//this is possible even variable names are same as order of datatypes is diff
	{
		System.out.println("Method oeverloading of String,int" );
	}
	static void method1()
	{
		System.out.println("static method without parameter");
	}
	static void method1(int a)
	{
		System.out.println("static method with int parameter value is - "+a);
	}
	
	
	public static void main(String[] args) {
		Ass_B45_48_Method_Overloading m =new Ass_B45_48_Method_Overloading();
		m.overload();
		m.overload(56,"Sujani");
		m.overload("Ravi",45);
		method1();
		method1(4);
	}

}
