package assignments_B45;

public class Ass_B45_59_HierarchyLevel_Inheritance_ChildClass2  extends Ass_B45_59_HierarchyLevel_Inheritance_ParentClass{

	public static void static_method1_ChildClass2()
	{
		System.out.println("static_method2_ChildClass2");
	}
	public void non_static_method1_ChildClass2()
	{
		System.out.println("non-static_method2_ChildClass2");
	}
	public static void main(String[] args) 
	{
		static_method1_ChildClass2();
		static_method1_ParentClass();
		Ass_B45_59_HierarchyLevel_Inheritance_ChildClass2 obj1=new Ass_B45_59_HierarchyLevel_Inheritance_ChildClass2();
		obj1.non_static_method1_ChildClass2();
		obj1.non_static_method1_ParentClass();

	}

}
