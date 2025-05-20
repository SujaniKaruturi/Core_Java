package assignments_B45;

import java.util.Scanner;

//using grotechminds  registration form enter details name,Email,Password,Gender,Present Address,Pincode using scanner class
public class Ass_B45_EnterUserDetials_Using_ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=s.next();
		System.out.println("Enter Emailid  ");
		String email=s.next();
		System.out.println("Enter Emailid  password ");
		String pword=s.next();
		System.out.println("Enter Gender ");
		String gender=s.next();
		System.out.println("Enter Present Address ");
		s.next();
		System.out.println("Enter pincode ");
		s.nextLong();
		System.out.println("name is "+ name);
		
		
		
	}

}
