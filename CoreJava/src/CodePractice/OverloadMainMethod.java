package CodePractice;

public class OverloadMainMethod {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		main();
		main(76);
		
	}
	public static void main(int a)  //over load main method
	{
		// TODO Auto-generated method stub
		System.out.println("over loading main method with 1 input parameter ");
	}
	
	public static void main()
	{
		// TODO Auto-generated method stub
		System.out.println("over loading main method with no input parameter ");
	}

}
