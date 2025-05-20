package assignments_B45;
//50. WAP which has Local, Global and Final variables in it.Print all variables value
//51.Print name 10 times
public class Ass_B45_50_51_local_global_final_variable {

	int a=45;	//same name to global and local variable is possible but it is not preferable
	//we can differentiate same variables of local,global using color- blue indicates global variable
	//int g;	//Declaration
	//g=100;	//Initialization in 2 diff lines is not possible for global variable
	int x;		 //default values
	//System.out.println("value of x" + x);	//outputing here is not possible
	double b;   
	float c;
	String d;   
	byte e;
	char f;
	boolean g;
	int h=800;    //non-static global variable
	static int k=90;	//static global variable
	final int op=890;
	public void add() 
	{
		int a=100;
		System.out.println("value of non-static local varaible a is " +a);
		int b=80;
		//static int p=80;	//Static variable are not allowed in local variable ,only final variables are allowed
		final int u=70;		//final variable who's value cannot be changed/modified
		System.out.println("value of final local varaible a is " +u);
		int c;	//Declaration
		c=90;	//Initialization in 2 diff lines is possible for local variable
		int f=a+b;
		System.out.println("addition of a,b is " +f);
	}
	public static void main(String[] args) {

		Ass_B45_50_51_local_global_final_variable l=new Ass_B45_50_51_local_global_final_variable();
		//System.out.println("value of a is" +x); 	//global variables cannot be outputted directly
		System.out.println("value of x is " +l.x);	//need to use reference variable to output global variable
		System.out.println("value of b is " +l.b);
		System.out.println("value of c is " +l.c);
		System.out.println("value of d is " +l.d);
		System.out.println("value of e is " +l.e);
		System.out.println("value of f is " +l.f);
		System.out.println("value of g is " +l.g);
		System.out.println("value of non-static global variable is " +l.h);
		System.out.println("value of static global variable is " +k);
		System.out.println("value of final variable is " +l.op);
		l.add();
		String name="sujani";
		for(int i=0;i<=10;i++)
		{
			System.out.println("print name 10 times - " +name);
		}
	}

}
