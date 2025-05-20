package CodePractice;
class Mumbai
{
	 void car()
	{
		System.out.println("Car");
	}
}
class Pune extends Mumbai
{
	 void vehicle()
	{
		System.out.println("vehicle");
	}
}
public class Delhi extends Pune
{

	 void room()
	{
		System.out.println("room");
	}
	public static void main(String[] args) 
	{
		Delhi d=new Delhi();
		d.room();
		d.vehicle();
		d.car();
	}

}
