package CodePractice;

public class OverloadingWithReturnType 
{
	int add(int a,int b)
	{
		int c =a+b;
		return c;
	}
	
	static int add(int a)
	{
		int d= a+786;
		return d;
	}
	double add(double r,double i)
	{
		double f= r+i;
		return f;
	}
	public static void main(String[] args) 
	{
		OverloadingWithReturnType r=new OverloadingWithReturnType();
		System.out.println(r.add(30,78));
		System.out.println(add(30));
		System.out.println(r.add(30.05,60.05));
	}

}



