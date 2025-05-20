package assignments_B45;

public class Ass_B45_98_99_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; 
		double convert =a;   //widening, implicit way of converting int into double
		System.out.println("Widening " +convert);
		double convert3 =(double)a;  //widening, explicit way of converting int into double
		
		double weight=65.9;
		int convert1 =(int)weight;
		System.out.println("Narrowing " +convert1);    //narrowing,can only be done explicitly
		
		byte age =56;   //age can be only stored in byte., Bye: -127 to +127
		short convert2 = age;   //widening,  short value: -32767 to +32767 
		System.out.println("Widening " +convert2);  
		//WAP for Narrowing Type casting. Convert double to int
		double x= 125.7;
		int y = (int) x; //explicit conversion
		System.out.println(y);
		System.out.println(x);
		
		//WAP for Widening Type casting. Convert int to double
		int x1= 123;
		double y1 = x; //implicit conversion
		double z = (int) x1;  //explicit conversion
		System.out.println(y1);  
		System.out.println(z);
		System.out.println(x1);
	}

}
