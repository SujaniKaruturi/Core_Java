package MKT_Java;

class Parent
{
	static void lkg()
	{
		System.out.println("static method of Parent class");
	}
	void ukg()
	{
		System.out.println("Non-static method of Parent class");
	}
}
class HierarchialLevelInheritance_Child1 extends Parent
{
	static void Pen()
	{
		System.out.println("static method of HierarchialLevelInheritance_Child1 class");
	}
	void Paper()
	{
		System.out.println("Non-static method of HierarchialLevelInheritance_Child1 class");
	}	
}
class HierarchialLevelInheritance_Child2 extends Parent{
	static void Pencil()
	{
		System.out.println("static method of HierarchialLevelInheritance_Child1 class");
	}
	void Book()
	{
		System.out.println("Non-static method of HierarchialLevelInheritance_Child1 class");
	}
	

}
public class HierarchialLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierarchialLevelInheritance_Child2 j =new HierarchialLevelInheritance_Child2();
		Parent.lkg();
		j.ukg();
		HierarchialLevelInheritance_Child2.Pencil();
		j.Book();
		
		HierarchialLevelInheritance_Child1 s =new HierarchialLevelInheritance_Child1();
		Parent.lkg();
		s.ukg();
		s.Paper();
		HierarchialLevelInheritance_Child1.Pen();
		
		
	}

}

