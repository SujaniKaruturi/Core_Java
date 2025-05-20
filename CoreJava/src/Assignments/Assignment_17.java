package Assignments;
//Ass17. Method overloading
public class Assignment_17 
{
	void add()
	{
		int c=30;
		int d=48;
		System.out.println("Addition of 2 numbers is " + (c+d));
	}
	static void add(String a)
	{
		System.out.println("static Method overloading 1 ");
	}
	static void add(int f,int c)
	{
		System.out.println("static Method overloading 2 ");
	}
	void add(String a,int b)
	{
		System.out.println("Method overloading 1 ");
	}
	
	void add(int a,String b) //method 2
	{
		System.out.println("Method overloading 2 ");
	}
	/*//this type of method overloading is not possible,as same datatype order should not be repititive as method_2 
	void add(int b,String a)   //method 3
	{
		System.out.println("Method overloading 2 ");
	}*/
	void add(double f,String a,int g)
	{
		System.out.println("Method overloading 3 ");
	}
	
	public static void main(String[] args) 
	{
		Assignment_17 a=new Assignment_17();
		add("Sujani");
		add(45,56);
		a.add();
		a.add("Sujani",100);
		a.add(1,"Home");
		a.add(23.0,"overloading",70);
		


	}

}
