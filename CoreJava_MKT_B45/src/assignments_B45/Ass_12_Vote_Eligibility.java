package assignments_B45;

import java.util.Scanner;

public class Ass_12_Vote_Eligibility {

	public void vote(int age)
	{
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
		
	}
	public static void main(String[] args) {
		Ass_12_Vote_Eligibility h=new Ass_12_Vote_Eligibility();
		h.vote(12);		//Passing input as arguments to methods
		Scanner s=new Scanner(System.in);	//Scanner Class input 
		System.out.println("Enter value of age");
		int child=s.nextInt();
		if(child>18)
		{
			System.out.println("Boy child");
		}
		else
		{
			System.out.println("Girl Child");
		}
	}

}
