package assignments_B45;

import java.util.Arrays;
import java.util.Scanner;

//Write program Accept the value of your array at the runtime ,if it is of int datatype size of 4
public class Ass_B45_43_Dynamic_input_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]=new int[4];
		for(int i=0; i<intArray.length; i++)
		{
			System.out.println("Enter int value at index - "+i);
			Scanner s1 = new Scanner(System.in);
			intArray[i] = s1.nextInt();
		}
		System.out.println("Final Array - "+Arrays.toString(intArray));
		
	}

}
