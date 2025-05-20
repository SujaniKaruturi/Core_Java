package assignments_B45;

public class Ass2_5_Static_Non_Static_Methods {

	public static void add()
	{
		System.out.println("Static method 1");
	}
	public static void mul()
	{
		System.out.println("Static method 2");
	}
	public void div()
	{
		System.out.println("Non-Static method 1");
	}
	public  void sub()
	{
		System.out.println("Non-Static method 2");
	}
	public static void main(String[] args) 
	{
		
		Ass2_5_Static_Non_Static_Methods v=new Ass2_5_Static_Non_Static_Methods();
		add();
		mul();
		v.div();
		v.sub();
		

	}

}
