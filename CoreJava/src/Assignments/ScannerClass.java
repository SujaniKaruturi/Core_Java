package Assignments;
//Ass37. Create class one and add class for add, substract,division,multiplication for 2 variables using scanner
import java.util.Scanner;
class ScannerExample 
{
	Scanner f=new Scanner(System.in);   //used for human input to accept value at run time
	void add()
	{
		//Scanner f=new Scanner(System.in);   //used for human input to accept value at run time
		
		System.out.println("Enter value of a");
		int a= f.nextInt();
		System.out.println("Enter value of b");
		int b =f.nextInt();
		int c =a+b;
		System.out.println("Value of c after addition is " +  c);
	}
	void subtract()
	{
		//Scanner f=new Scanner(System.in);   //used for human input to accept value at run time
		System.out.println("Enter value of u");
		int u= f.nextInt();
		System.out.println("Enter value of m");
		int m =f.nextInt();
		int k =u-m;
		System.out.println("Value of c after subtraction is " +  k);
	}
	void division()
	{
		//Scanner f=new Scanner(System.in);   //used for human input to accept value at run time
		System.out.println("Enter value of e");
		int e= f.nextInt();
		System.out.println("Enter value of g");
		int g =f.nextInt();
		float s = e/g;
		System.out.println("Value of s after division is " + s);
	}
	void multiply()
	{
		//Scanner f=new Scanner(System.in);   //used for human input to accept value at run time
		System.out.println("Enter value of p");
		int p= f.nextInt();
		System.out.println("Enter value of q");
		int q =f.nextInt();
		double i=p*q;
		System.out.println("Value of i after multiplication  is " + i);
	}
}
public class Assignment_37 extends ScannerExample
{
	
	public static void main(String[] args)
	{
		
		Assignment_37 y = new Assignment_37();
		y.add();
		y.subtract();
		y.division();
		y.multiply();
		
		/*
		Scanner f=new Scanner(System.in);   //used for human input to accept value at run time
		System.out.println("Enter value of a");
		int a= f.nextInt();
		System.out.println("Enter value of b");
		int b =f.nextInt();
		int c =a+b;
		System.out.println("Value of c after addition is " +  c);
		int d=a-b;
		System.out.println("Value of d after subtraction is "  + d);
		System.out.println("Enter value of e");
		int e= f.nextInt();
		System.out.println("Enter value of g");
		int g =f.nextInt();
		double s = e/g;
		System.out.println("Value of s after division is " + s);
		System.out.println("Enter value of p");
		int p= f.nextInt();
		System.out.println("Enter value of q");
		int q =f.nextInt();
		double i=p*q;
		System.out.println("Value of i after multiplication  is " + i);
		*/

	}
	
}
