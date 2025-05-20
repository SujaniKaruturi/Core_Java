package Assignments;

public class Ass27_Hier_Child3 extends Parent_1
{
	static void btech1 ()
	{
		System.out.println("static method of Ass27_Hier_Child3 class");
	}
	void btech2()
	{
		System.out.println("Non-static method of Ass27_Hier_Child3 class");
	}
	public static void main(String[] args)
	{
		Ass27_Hier_Child3 g=new Ass27_Hier_Child3();
		g.btech2();
		btech1();
		lkg();
		g.ukg();



	}

}
