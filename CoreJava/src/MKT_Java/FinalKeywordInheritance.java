package MKT_Java;

class Books{
	final static void add() //compile error
	 {
		 System.out.println("Hello world");
	 }
 }
public class FinalKeywordInheritance extends Books {
    //static void add() //compile error,as final method cannot be inherited
     {
    	 System.out.println("Hi");
     }
     final  static int a=13;
	public static void main(String[] args) {
		add();
		//a=56;   //compile time error , final variable cannot be changed
		System.out.println(a);
	}

}