package CodePractice;

public class LocalGlobalVariables 
{
	//int b;     //GV cannot be declared first and initialized next 
	//b=500;
	
	int c=500;  //Global Variable
	void add()
	{
		int a;       //Local Variable
		a=100;
		System.out.println("local variable value is " + a);
	}
	public static void main(String[] args)
	{
	}

}
