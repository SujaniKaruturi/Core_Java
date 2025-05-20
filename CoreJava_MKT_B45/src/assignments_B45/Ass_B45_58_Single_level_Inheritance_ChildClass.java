package assignments_B45;

public class Ass_B45_58_Single_level_Inheritance_ChildClass  extends Ass_B45_58_Single_level_Inheritance_ParentClass{
	public static void child_Static_method1()
	{
		System.out.println("Child class Static method");
	}
	public void child_NonStatic_method2()
	{
		System.out.println("Child class Non Static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child_Static_method1();
		parent_static_method1();
		Ass_B45_58_Single_level_Inheritance_ChildClass obj = new Ass_B45_58_Single_level_Inheritance_ChildClass();
		obj.child_NonStatic_method2();
		obj.parent_NonStatic_method2();
		
	}

}
