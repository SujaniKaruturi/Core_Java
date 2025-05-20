package assignments_B45;
//Used to call once constructor from another constructor with in same class
public class Ass_B45_61_this_Calling_Statement {
	Ass_B45_61_this_Calling_Statement()
	{
		this(98,"Hello");
		System.out.println("constructor with no parameters");
	}
	Ass_B45_61_this_Calling_Statement(boolean s)
	{
		this(789.034f,"How");
		System.out.println("constructor with boolean parameters");
	}
	Ass_B45_61_this_Calling_Statement(String f,float h)
	{
		this('H');
		System.out.println("constructor with String,float parameters");
	}
	Ass_B45_61_this_Calling_Statement(int a)
	{
		System.out.println("constructor with int parameters");
	}
	Ass_B45_61_this_Calling_Statement(char v)
	{
		this(true);
		System.out.println("constructor with Char parameters");
	}
	Ass_B45_61_this_Calling_Statement(float i, String l)
	{
		this(456);
		System.out.println("constructor with float,String parameters");
	}
	Ass_B45_61_this_Calling_Statement(int e,String j)
	{
		this("Why",345.789f);
		System.out.println("constructor with int,String parameters");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Ass_B45_61_this_Calling_Statement();
	}

}
