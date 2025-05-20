package assignments_B45;

public class Ass_B45_21_MultiLevel_SeperateClass_SuperClass extends Ass_B45_21_MultiLevel_SeperateClass_SuperMostClass {


	static void method_superClass_Static()
	{
		System.out.println("method_superClass_Static");
	}
	void method_superClass_NonStatic(int s)
	{
		System.out.println("method_superClass_NonStatic");
		System.out.println("Value of s is "+s);
	}

}
