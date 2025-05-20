package assignments_B45;

import java.util.Arrays;

public class Ass_B45_27_ReverseAnArray {

	static public void reverseArray()
	{
		//Array intArray[]= new Array[5];
		int intArray[] = {2,4,6,8,10};
		int length = intArray.length;
		int reverseArray[] = new int[5];
		int copyArray[]=new int[5];
		for(int i=0; i<length;i++)
		{
			copyArray[i]=intArray[i];
			reverseArray[i] = intArray[length-i-1];
		}
		System.out.println("Length of Array " +length);
		System.out.println("Array is " + Arrays.toString(intArray));
		System.out.println("Copied Array is " + Arrays.toString(copyArray));
		System.out.println("Reversed Array is " + Arrays.toString(reverseArray));
		
		/*
		 * for(int i=0,j=length-1; i<length; i++,j--) //Another way of reverse the array
		 * { reverseArray[j]=intArray[i]; }
		 */
		
		for(int i=0,j=4; i<length; i++,j--) 	//Another way of reverse the array
		{
			reverseArray[j]=intArray[i];	
		}
		
		System.out.println("Second way using 2 variables ,Reversed Array is " + Arrays.toString(reverseArray));
	}
	static public void copyArraywhesizeofarraynotsam()
	{
		int intArray2[] = {2,4,6,8,10};
		int copyArray[] = new int[5];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseArray();
	}

}
