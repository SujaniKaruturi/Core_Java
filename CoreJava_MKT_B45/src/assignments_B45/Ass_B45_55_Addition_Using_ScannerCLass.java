package assignments_B45;

import java.util.Scanner;

public class Ass_B45_55_Addition_Using_ScannerCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a - ");
		int a= s.nextInt();
		System.out.println("Enter the value of b - ");
		int b= s.nextInt();
		int add =a+b;
		System.out.println("Addition of 2 values "+ a +"+"+ b + " is - " +add);
	}

}
