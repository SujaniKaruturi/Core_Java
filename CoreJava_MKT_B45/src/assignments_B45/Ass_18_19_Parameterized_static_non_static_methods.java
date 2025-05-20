package assignments_B45;
//18.Write a program with parameterized static method using char and boolean as parameters
//19.Write a program with parameterized non-static method using paramaters and try to call in main method
public class Ass_18_19_Parameterized_static_non_static_methods {
	
	public static void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Value of c is " +c);
	}
	public static void sub(char c,boolean h)
	{		
		System.out.println("Value of c is " +c);
		System.out.println("Value of h is " +h);
	}
	public static void mul(int f,int g)
	{		
		int j=f*g;
		System.out.println("Value of j after multipication is " +j);
	}
	
	public static void main(String[] args) 
	{
		add(45,89);
		sub('v',false);
		Ass_18_19_Parameterized_static_non_static_methods l= new Ass_18_19_Parameterized_static_non_static_methods();
		l.mul(6,6);
	}
}
