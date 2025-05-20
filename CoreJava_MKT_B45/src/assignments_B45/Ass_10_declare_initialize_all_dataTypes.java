package assignments_B45;

public class Ass_10_declare_initialize_all_dataTypes {

	public static void main(String[] args) 
	{
		// Declaration and initialization by method 1 
		numericDataType();
		decimalDataType();
		charStringDataType();
		booLeanDataType();
		// declaration and initialization by method 2
		decInitMethod2();
		
		
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
