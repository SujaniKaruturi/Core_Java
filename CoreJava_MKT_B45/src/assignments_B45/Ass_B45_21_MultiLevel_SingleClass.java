package assignments_B45;

class SuperMostClass
{
	static void method1_SuperMostClass_Static()
	{
		System.out.println("method1_SuperMostClass_Static");
	}
	void method1_SuperMostClass_NonStatic()
	{
		System.out.println("method1_SuperMostClass_NonStatic");
	}
	
}

class SuperClass extends SuperMostClass
{
	static void method1_SuperClass_Static()
	{
		System.out.println("method1_SuperClass_Static");
	}
	void method1_SuperClass_NonStatic()
	{
		System.out.println("method1_SuperClass_NonStatic");
	}
	
}
public class Ass_B45_21_MultiLevel_SingleClass extends SuperClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1_SuperClass_Static();
		method1_SuperMostClass_Static();
		Ass_B45_21_MultiLevel_SingleClass obj1=new Ass_B45_21_MultiLevel_SingleClass();
		obj1.method1_SuperMostClass_NonStatic();
		obj1.method1_SuperClass_NonStatic();
	}

}
