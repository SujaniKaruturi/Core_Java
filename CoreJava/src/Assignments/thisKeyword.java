package Assignments;
//Ass_46: Program using this keyword.
//this keyword can only be used when the parameters of global variable(only data types should be same and names can be different) and parameters of methods are same,to equalize both of them.
//Disadvantage of this keyword is it can only be used in non-static methods
//when we want non-static local variables values to be set to global variables values then this keyword is used.
public class Assignment_46 
{
	int a;
	//int a=100; then value of a will be updated.
	float b;
	double c;
	String d;
	static int h;
	void add(int j,float h,double u,String i)
	{	
		//color blue a represents global variable 'a'(left side 'a') ,where color brown a represents input parameter 'a' of method add()(right side 'a').
		//so input value of method add() 'a' is been assigned to global variable 'a'.
		this.a=j;
		this.b=h;
		this.c=u;
		this.d=i;
		System.out.println("Method1");
	}
	public static void main(String[] args)
	{
		Assignment_46 g=new Assignment_46();
		g.add(4,7f, 6.57,"Hello");    //output of this method when called first is : Method1, 4, 7.0, 6.57, Hello, 0 
		System.out.println(g.a);   //default values
		System.out.println(g.b);
		System.out.println(g.c);
		System.out.println(g.d);
		System.out.println(g.d);
		System.out.println(g.d);
		System.out.println(h);
		//g.add(4,7f, 6.57,"Hello");	//output of this method when called last is : Method1, 0, 0.0, 0.0 , null, 0 ,Method1
		

	}

}
