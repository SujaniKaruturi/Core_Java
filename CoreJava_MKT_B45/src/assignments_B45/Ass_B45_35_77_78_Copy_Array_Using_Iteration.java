package assignments_B45;

import java.util.Arrays;

//35,77.Copy the value of one array to another array using iteration
//78. Reverse an array
public class Ass_B45_35_77_78_Copy_Array_Using_Iteration {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int intArray[] = {2,4,6,8,10};
		int length = intArray.length;
		int reverseArray[] = new int[5];
		int copyArray[]=new int[5];
		for(int i=0; i<length;i++)
		{
			copyArray[i]=intArray[i];
			reverseArray[i] = intArray[length-i-1];
		}
		System.out.println("Array is " + Arrays.toString(intArray));
		System.out.println("Copied Array is " + Arrays.toString(copyArray));
		System.out.println("Copied Array is " + Arrays.toString(reverseArray));
	}

}
