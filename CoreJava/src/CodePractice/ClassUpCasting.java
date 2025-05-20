package CodePractice;
class Up
{
	void left()
	{
		System.out.println("up: left method");
		
	}
	void right()
	{
		System.out.println("up: right method");
		
	}
}
class CountryClass extends Up
{
	void japan()
	{
		System.out.println("Country: japan method");
		
	}
	void russia()
	{
		System.out.println("Country: russia method");
		
	}
}
class State_class1 extends CountryClass
{
	void ap()
	{
		System.out.println("State:  ap method");
		
	}
	void telangana()
	{
		System.out.println("State:  telangana method");
		
	}
}
public class ClassUpCasting extends CountryClass
{
	void tanuku()
	{
		System.out.println("Class_TypeCasting2: tanuku method");
		
	}
	void vizag()
	{
		System.out.println("Class_TypeCasting2: vizag method");
		
	}
	public static void main(String[] args)
	{	
		/*
		CountryClass cc=new ClassUpCasting();   //upcasting. inheriting country class so we can onnly access methods of country class only
		cc.japan();
		cc.russia();
		//cc.ap();			//with the help of cc,we cannot access child class methods.
		//cc.telangana();
		//cc.tanuku();		//with the help of cc,we cannot access child class methods.
		//cc.vizag();		//with the help of cc,we cannot access child class methods.
		*/
		
		
		CountryClass cc1=new ClassUpCasting();   //upcasting. inheriting country class so we can onnly access methods of country class only
		cc1.left();  //inheriting country class so we can only access methods of country class and the classes above the country class i.e Up class as well
		cc1.right();
		cc1.japan();
		cc1.russia();
		//cc.ap();			//with the help of cc,we cannot access child class methods.
		//cc.telangana();
		//cc.tanuku();		//with the help of cc,we cannot access child class methods.
		//cc.vizag();		//with the help of cc,we cannot access child class methods.
		
	}

}
