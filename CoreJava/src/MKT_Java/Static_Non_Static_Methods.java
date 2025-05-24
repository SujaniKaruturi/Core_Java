package MKT_Java;

public class Static_Non_Static_Methods {

	public static void add()
	{
		System.out.println("Non- Para Static method ");
	}
	public static void mul(int  a)
	{
		System.out.println("Para Static method ");
	}
	public void div()
	{
		System.out.println("Non-Para Non-Static method ");
	}
	public  void sub(String f)
	{
		System.out.println("Para Non-Static method ");
	}
	public static void main(String[] args) 
	{
		
		Static_Non_Static_Methods v=new Static_Non_Static_Methods();
		add();
		mul(6);
		v.div();
		v.sub("Hello");
		

	}

}
