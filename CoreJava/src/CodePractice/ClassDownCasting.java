package CodePractice;
class Up_Class
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
class Country_Class extends Up_Class
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
class State__class1 extends Country_Class
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
public class ClassDownCasting extends State__class1
{
	void tanuku()
	{
		System.out.println("ClassDownCasting: tanuku method");
		
	}
	void vizag()
	{
		System.out.println("ClassDownCasting: vizag method");
		
	}

	public static void main(String[] args)
	{
		Country_Class cc=new ClassDownCasting();
		ClassDownCasting c2=(ClassDownCasting)cc;  //downcasting ,can be done explicitly only.
		c2.left();
		c2.right();
		c2.japan();
		c2.russia();
		c2.ap();
		c2.telangana();
		c2.tanuku();
		c2.vizag();
	}

}
