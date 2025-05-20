package assignments_B45;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass_B45_42_Throw_Throws_Keywords {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		System.out.println("Enter Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println(" Age Entered is equal to 20 or not " + age);
		if(age != 20)
		{
		throw new InputMismatchException("Exception occured");
		}
	}

}
