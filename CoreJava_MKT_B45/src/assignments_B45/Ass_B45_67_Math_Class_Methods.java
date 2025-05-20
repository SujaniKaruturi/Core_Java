package assignments_B45;

public class Ass_B45_67_Math_Class_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;
		float c=123.5f;
		float c1=1023.5f;
		double d=100.234;
		double d1=1000.234;
		long l = 12300;
		long l1 = 12352;
		
		System.out.println(Math.addExact(a, b));	//int parameters
		System.out.println(Math.addExact(l,l));	//long paramaters Ex of method overloading
		System.out.println(Math.subtractExact(a, b));	//int parameters
		System.out.println(Math.subtractExact(l, b));	//long paramaters
		System.out.println(Math.max(a, b));		//int parameters
		System.out.println(Math.max(c,c1));		//float parameters
		System.out.println(Math.max(d,d1));		//double parameters
		System.out.println(Math.max(l,l1));		//long parameters
		System.out.println(Math.min(a, b));		//int parameters
		System.out.println(Math.min(c,c1));		//float parameters
		System.out.println(Math.min(d,d1));		//double parameters
		System.out.println(Math.min(l,l1));		//long parameters
		System.out.println(Math.multiplyExact(a, b));	//int parameters
		System.out.println(Math.multiplyExact(l1, l));	//long paramaters
		System.out.println(Math.multiplyExact(a, l));	//int,long paramaters
		System.out.println(Math.abs(a));		//int parameters
		System.out.println(Math.abs(l));	//float parameters
		System.out.println(Math.abs(d));	//double parameters
		System.out.println(Math.abs(c));	//long parameters 
		System.out.println(Math.random());	//generate random number between 0 and 1 double data type
		
	
	}

}
