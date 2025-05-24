package MKT_Java;
//Used to call once constructor from another constructor with in same class
public class This_Calling_Statement {
	This_Calling_Statement()
	{
		this(98,"Hello");
		System.out.println("constructor with no parameters");
	}
	This_Calling_Statement(boolean s)
	{
		this(789.034f,"How");
		System.out.println("constructor with boolean parameters");
	}
	This_Calling_Statement(String f,float h)
	{
		this('H');
		System.out.println("constructor with String,float parameters");
	}
	This_Calling_Statement(int a)
	{
		System.out.println("constructor with int parameters");
	}
	This_Calling_Statement(char v)
	{
		this(true);
		System.out.println("constructor with Char parameters");
	}
	This_Calling_Statement(float i, String l)
	{
		this(456);
		System.out.println("constructor with float,String parameters");
	}
	This_Calling_Statement(int e,String j)
	{
		this("Why",345.789f);
		System.out.println("constructor with int,String parameters");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new This_Calling_Statement();
	}

}
