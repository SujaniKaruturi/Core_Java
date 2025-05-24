package MKT_Java;
//Order of execution: SIB , Main Method, IIB , Constructor
public class SIB_IIB_Constructor_MainMethod 
{

	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	SIB_IIB_Constructor_MainMethod()
	{
		System.out.println("Constructor");
	}
	void maths()
	{
		System.out.println("Non-static Method");
	}
	
	static void add()
	{
		System.out.println("static Method");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		SIB_IIB_Constructor_MainMethod n  =new SIB_IIB_Constructor_MainMethod();
		new SIB_IIB_Constructor_MainMethod();      //object creation 2nd time to check order of execution
		add();
		n.maths();
		

	}

}
