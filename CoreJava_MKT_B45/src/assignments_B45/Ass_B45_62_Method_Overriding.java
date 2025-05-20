package assignments_B45;

class SuperClass_1
{
	static void static_method()
	{
		System.out.println("Static Method of Superclass - method1");
	}
	 void nonstatic_method()
	{
		System.out.println("non-Static Method of Superclass- method2");
	}
}
public class Ass_B45_62_Method_Overriding extends SuperClass_1 {

	static void static_method()
	{
		System.out.println("Static Method of childclass - method1");
	}
	 void nonstatic_method()
	{
		System.out.println("non-Static Method of childclass- method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ass_B45_62_Method_Overriding i=new Ass_B45_62_Method_Overriding();
		i.nonstatic_method();
		static_method();
		
		
//As static methods cannot be overriden, this methods call superclass_1 static method but not Childclass static method
//but static_method() is outputiing "Static Method of childclass - method1" instead of "Static Method of Superclass - method1".   
	}

}
