package CodePractice;
//Compile Time Polymorphism
public class Polymorphism {

	public void add()
	{
		int a=10+100;
		System.out.println(a);
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a)
	{
		int c=a+100;
		System.out.println(c);
	}
	public void add(double a)
	{
		double c=a+100;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Polymorphism pp=new Polymorphism();
		pp.add();
		pp.add(66,55);
		pp.add(77);
		pp.add(44);
	}

}
