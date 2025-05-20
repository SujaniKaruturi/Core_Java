package CodePractice;


class House
{
	static void car()
	{
		System.out.println("Car");
	}
	static void vehicle()
	{
		System.out.println("Vehicle");
	}
}
public class Inheritance extends House
{

	static void cycle()
	{
		System.out.println("Cycle");
	}
	public static void main(String[] args)
	{
		car();
		cycle();
		vehicle();
		
	}

}
