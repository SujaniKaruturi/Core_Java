package CodePractice;
class Country_class
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
class State_class extends Country_class
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
public class Class_TypeCasting2 extends State_class
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
		State_class sc= new Class_TypeCasting2(); //upcasting, implicit way
		sc.japan();
		sc.russia();
		sc.ap();
		sc.telangana();
		//sc.tanuku();		//with the help of sc,we cannot access child class methods.
		//sc.vizag();		//with the help of sc,we cannot access child class methods.

	}

}
