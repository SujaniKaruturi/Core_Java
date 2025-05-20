package CodePractice;
 
//Abstract Class extends Abstract Class
//Abstract class can have both abstract and concrete method
abstract class Ac1
{
	abstract void fox();
	void hell()     //concrete method
	{
		System.out.println("non-static: hell method from Abstarct class 1 ");
	}
}
abstract class Ac2 extends Ac1
{
	abstract void dog();
	static void heaven()    //concrete method
	{
		System.out.println("static: heaven method from Abstarct class 2 ");
	}

}
public class AcextendsAc extends Ac2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AcextendsAc f = new AcextendsAc();
		f.dog();
		f.fox();
		f.hell();
		heaven();
	}

	@Override
	void dog() {
		// TODO Auto-generated method stub
		System.out.println("dog method from Abstarct class 2 ");
	}

	@Override
	void fox() {
		// TODO Auto-generated method stub
		System.out.println("fox method from Abstarct class 1 ");
	}

}
