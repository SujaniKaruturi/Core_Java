package MKT_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTryCatch {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		try
		{
			/*
			//Example 1:
			System.out.println("Enter value of a");
			int a=sc.nextInt();   //inputmismatchexception
			*/
			/*
			//Example 2:
			int num=1/1;  //uncomment and try to execute,then only finally blocks gets executed as there is no exception .
			*/
			/*
			//Example 3:
			int num1=1/0;  //ArithmeticException
			*/
			/*
			//Example 4:
			String f= null;
			System.out.println("Value of f is " + f);
			System.out.println("Length of f is " + f.length());
			*/
			
			//Example 5:
			System.out.println("Enter byte value as 32000 and check exception");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter salary ");  //-128 to 127 is byte range,so java.util.InputMismatchException is seen
			byte salary=s.nextByte();
			System.out.println("Salary is " +salary);
			
		}
		catch(InputMismatchException c)
		{
			System.out.println(" InputMismatchException catch block");
		}
		catch(ArithmeticException c)
		{
			System.out.println(" ArithmeticException catch block 2");
		}
		catch(NullPointerException c)
		{
			System.out.println(" NullPointerException catch block 2");
		}
	
		finally 
		{
			System.out.println("finally block");
		}

	}

}
