package MKT_Java;

public class Global_Local_Variables {

	//default values
	int a=45;	
	int x;		 
	double b;   
	float c;
	String d;   
	byte e;
	char f;
	boolean g;
	int h=800;    //non-static global variable
	static int k=90;	//static global variable
	final int op=890;
	public static void main(String[] args) 
	{
		// Declaration and initialization by method 1 
		numericDataType();
		decimalDataType();
		charStringDataType();
		booLeanDataType();
		// declaration and initialization by method 2
		decInitMethod2();
		
		Global_Local_Variables l=new Global_Local_Variables();
		System.out.println("value of x is " +l.x);	//need to use reference variable to output global variable
		System.out.println("value of b is " +l.b);
		System.out.println("value of c is " +l.c);
		System.out.println("value of d is " +l.d);
		System.out.println("value of e is " +l.e);
		System.out.println("value of f is " +l.f);
		System.out.println("value of g is " +l.g);
		System.out.println("value of non-static global variable is " +l.h);
		System.out.println("value of static global variable is " +k);
		System.out.println("value of final variable is " +l.op);
		
	}
	static void numericDataType()
	{
		byte s = 127;
		//byte l = 128;  //as 128 is max value of byte ,it gives compilation error
		short t = 32767;
		int d = 2357341;
		long p = 1212656345;
		System.out.println("Byte "+ s);
		System.out.println("short " + t);
		System.out.println("int "+d);
		System.out.println("long " +p);
	}
	static void decimalDataType()
	{
		float m = 1234.142f;		// float can store decimal points up to 3 digits
									// we have to write f in front of float value always
		double w = 1234.457249;		// double can store decimal points up to 17 digits
		System.out.println("float "+m);
		System.out.println("double "+w);
	}
	static void charStringDataType()
	{
		char h = 'P';
		String strng = "Sujani";
		System.out.println("char "+h);
		System.out.println("string "+strng);
	}
	static void booLeanDataType()
	{
		boolean b = true;
		boolean b1 = false;
		System.out.println("boolean "+b);
		System.out.println("boolean "+b1);
		
	}
	static void decInitMethod2()
	{
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String s1;
		boolean b1;
		
		b = 127;
		s = 32767;
		i = 1233534;
		l = 2132534654;
		f = 1234.234f;
		d = 1234.542348;
		c = 'C';
		s1 = "This is String";
		b1 = true;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s1);
		System.out.println(b1);
				
	}

}
