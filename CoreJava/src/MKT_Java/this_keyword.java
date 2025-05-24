package MKT_Java;
//Whenever the global variable will be same as method parameter, I can make use of this keyword. 
//This keyword can only be used in non-static methods. 
//This keyword can be used to constructor as well.
public class this_keyword {

	int age =1000;
	int i=90;
	String s1="Hello";
	static int junk=100;
	
	public void method1()
	{
		int age = 500;
		this.age= age;
		System.out.println("Local variable value of age - " +age);
	}
	void method2(int y, String z)
	{
		System.out.println("Local variable value of i - " +y);
		System.out.println("Local variable value of s1 - " +z);
		this.i=y;
		this.s1=z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_keyword o=new this_keyword();
		System.out.println("Global variable value of age original value- " +o.age);
		o.method1();
		System.out.println("Global variable value of age after this keyword usage- " +o.age);
		o.method2(3456,"Sujani");
		System.out.println("Global variable value of i after this keyword usage- " +o.i);
		System.out.println("Global variable value of s1 after this keyword usage- " +o.s1);
		System.out.println("Global variable value of junk static variable is - " + junk);
	}

}
