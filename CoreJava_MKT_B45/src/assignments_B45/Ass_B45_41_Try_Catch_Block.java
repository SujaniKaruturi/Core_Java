package assignments_B45;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass_B45_41_Try_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter age ");
		try
		{
		int age = s1.nextInt();
		}
		catch(InputMismatchException e1)
			
		{
			System.out.println("Exception occured - ");
		}
		finally
		{
			System.out.println("Finally block executed");
		}
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
				finally
				{
					System.out.println("Finally block executed 2nd time");
				}
	}

}
