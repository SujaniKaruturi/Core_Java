package Assignments;

public class Ass27_Hier_Child4 extends Parent_1
{
	static void btech3 ()
	{
		System.out.println("static method of Ass27_Hier_Child4 class");
	}
	void btech4()
	{
		System.out.println("Non-static method of Ass27_Hier_Child4 class");
	}
	public static void main(String[] args)
	{
		
		Ass27_Hier_Child4 g=new Ass27_Hier_Child4();
		g.btech4();
		btech3();
		lkg();
		g.ukg();

	}

}
