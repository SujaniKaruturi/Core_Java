package assignments_B45;

import java.util.Scanner;
//USe nextByte() give 32000 as input,check what it the exception
public class Ass_B45_20_nextByte_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter byte value as 32000 and check exception");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary ");  //-128 to 127 is byte range,so java.util.InputMismatchException is seen
		byte salary=s.nextByte();
		System.out.println("Salary is " +salary);
	}

}
