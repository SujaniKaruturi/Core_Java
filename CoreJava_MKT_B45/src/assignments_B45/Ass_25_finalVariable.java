package assignments_B45;

import java.util.Scanner;

public class Ass_25_finalVariable {

	public static void main(String[] args) {
		final int g=100;
		System.out.println("value of final global varaible a is " +g);
		Scanner s=new Scanner(System.in);
		//g=s.nextInt();	//Run time input to final variable is not possible,so final variable values cannot be changed
		System.out.print("Enter the value of h ");
		int h=s.nextInt();	//Run time input to any other variable is possible 
		
	}

}
