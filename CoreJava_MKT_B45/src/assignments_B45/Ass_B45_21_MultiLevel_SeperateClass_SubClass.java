package assignments_B45;

public class Ass_B45_21_MultiLevel_SeperateClass_SubClass extends Ass_B45_21_MultiLevel_SeperateClass_SuperClass {

	static void method_subClass_Static(String name)
	{
		System.out.println("method_subClass_Static");
		System.out.println("Subclass name is "+name);
	}
	void method_subClass_NonStatic(int a)
	{
		System.out.println("method_subClass_NonStatic");
		System.out.println("Value of a is "+a);
	}
	public static void main(String[] args) 
	{
		method_subClass_Static("Pradnya");
		method_superClass_Static();
		method_superMostClass_Static();
		Ass_B45_21_MultiLevel_SeperateClass_SubClass o1 = new Ass_B45_21_MultiLevel_SeperateClass_SubClass();
		o1.method_subClass_NonStatic(100);
		o1.method_superClass_NonStatic(9);
		o1.method_superMostClass_NonStatic(124);
		
	}

}
