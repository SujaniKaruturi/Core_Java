package assignments_B45;

import java.util.Scanner;

public class Ass_B45_30_Multiple_If_Blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the age in int value: ");
		int age = s1.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Illigible for voting");
		}
		
		if(age < 18)
		{
			System.out.println("Not Illigible for voting");
		}
		
	}

}
