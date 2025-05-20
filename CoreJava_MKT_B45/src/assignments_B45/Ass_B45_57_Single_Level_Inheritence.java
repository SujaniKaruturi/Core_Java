package assignments_B45;

class ParentClass
{
	public static void method1()
	{
		System.out.println("Parent class Static method");
	}
	public void method2()
	{
		System.out.println("Parent class Non Static method");
	}
}
public class Ass_B45_57_Single_Level_Inheritence extends ParentClass {
	
	public static void Childmethod1()
	{
		System.out.println("Child class Static method");
	}
	public void Childmethod2()
	{
		System.out.println("Child class Non Static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childmethod1();
		method1();
		Ass_B45_57_Single_Level_Inheritence obj = new Ass_B45_57_Single_Level_Inheritence();
		obj.Childmethod2();
		obj.method2();
	}

}
