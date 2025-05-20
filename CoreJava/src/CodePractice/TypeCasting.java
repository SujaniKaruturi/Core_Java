package CodePractice;

public class TypeCasting {

	public static void main(String[] args) 
	{

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
		
	}

}
