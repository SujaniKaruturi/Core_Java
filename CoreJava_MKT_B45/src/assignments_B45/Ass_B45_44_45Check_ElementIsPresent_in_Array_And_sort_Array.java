package assignments_B45;

import java.util.Arrays;
import java.util.Scanner;

//44.Create a array of size of 5 and just check 34 is present in array or not
//45.Sort values of array
public class Ass_B45_44_45Check_ElementIsPresent_in_Array_And_sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {143,2,67,23,234,16,34};
		System.out.println("Array before sorting - "+Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("Array After sorting - "+Arrays.toString(intArray));
		System.out.println();
		for(int i=0; i<intArray.length; i++)
		{
			if(intArray[i] == 34)
			{
				System.out.println("Current element is "+intArray[i] );
				System.out.println("34 Element exists");	
			}
		}
		
	}

}
