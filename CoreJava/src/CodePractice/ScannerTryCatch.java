package CodePractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTryCatch {

	
	
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		
		//System.out.println("Enter value of a");
		//int a=sc.nextInt();    //input a="SUjani" ,then inputmismatchexception occurs
		
		try
		{
			//System.out.println("Enter value of a");
			//int a=sc.nextInt();   //inputmismatchexception
			//int num=1/1;  //uncomment and try to execute,then only finally blocks gets executed as there is no exception .
			int num1=1/0;  //ArithmeticException
		}
		catch(InputMismatchException c)
		{
			System.out.println("catch block");
		}
		catch(ArithmeticException c)
		{
			System.out.println("catch block 2");
		}
		finally 
		{
			System.out.println("finally block");
		}

	}

}
