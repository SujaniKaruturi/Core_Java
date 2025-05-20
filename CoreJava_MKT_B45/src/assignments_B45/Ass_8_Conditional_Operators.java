package assignments_B45;

public class Ass_8_Conditional_Operators {

	public static void main(String[] args) {
		int a=100;
		int b=50;
		int c=40;
		
		if(a>b && a!=c)
		{
			System.out.println("print a " + a);
		}
		if(a<b || b!=c)
		{
			System.out.println("print a " + b);
		}
		if( a!=c)
		{
			System.out.println("print a " + c);
		}

	}

}
