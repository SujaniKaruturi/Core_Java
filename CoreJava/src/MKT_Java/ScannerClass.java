package MKT_Java;

import java.util.Scanner;

class ScannerExample 
{

		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter value of int ");
			int a= s.nextInt();
			System.out.println("Enter value of byte ");
			byte b= s.nextByte();
			System.out.println("Enter value of Float ");
			float f=s.nextFloat();
			System.out.println("Enter value of double ");
			double d=s.nextDouble();
			System.out.println("Enter value of String ");
			String j=s.next();
			System.out.println("Enter value of Char ");
			//char c=s.next(); //donot have any method for char ,so we need to input Char value using String only.
			String o=s.next();
			
			
		}
		
	
}

