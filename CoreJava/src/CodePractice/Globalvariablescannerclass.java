package CodePractice;

import java.util.Scanner;

public class Globalvariablescannerclass {

	public static void main(String[] args)
	{
		int a =100;
		int b=90;
		Globalvariablescannerclass u= new Globalvariablescannerclass();
		u.addition();
		u.subtract();
	}

	void addition()
	{
		Scanner s2 =new Scanner(System.in); 
		System.out.println("Enter value of a");
		int a=s2.nextInt();
		System.out.println("Enter value of b");
		int b=s2.nextInt();
		int c = a+b;
		System.out.println("Addition value is "+c);
	}

	void subtract()
	{
		Scanner s2 =new Scanner(System.in); 
		System.out.println("Enter value of a");
		int a=s2.nextInt();
		System.out.println("Enter value of b");
		int b=s2.nextInt();
		int c = a-b;
		System.out.println("subtraction value is "+c);
	}
}
