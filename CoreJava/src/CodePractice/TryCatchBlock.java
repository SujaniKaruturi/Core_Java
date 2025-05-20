package CodePractice;

public class TryCatchBlock {

	public static void main(String[] args)
	{
		//0 divided by 1 is 0, 1 divided by 0 is infinity.
		//int a = infinity ,is not posible
		//int number = 1/0;   //ArithmeticException
		try
		{
			int number1 = 1/0;      //int num=1/1 ,will never give exception ,so catch block gets executed.
			System.out.println("Try block");
		}
		catch(ArithmeticException a1)   //only for ArithmeticException
		{
			System.out.println("Catch block - ArithmeticException ");
		}
		catch(NullPointerException a2)   //only for nullpointer exception
		{
			System.out.println("Catch block - NullPointerException");
		}
	}
	
}
