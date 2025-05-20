package CodePractice;

import java.util.Arrays;

//copy one array into another array in reverse order
public class CopyArrayElements {

	public static void main(String[] args) {
		int Array[]= {5,10,15,20,25};
		int l=Array.length;
		System.out.println("Length "+ l);
		int ReverseArray[]= new int[l];    //Array B is same as length of array A
		int CopyArray[]=new int[l];
		/*
		 * for(int i=0;i<l;i++) { CopyArray[i]=Array[i]; //copying elements
		 * ReverseArray[i]=Array[l-1-i]; //copying in reverse order
		 * System.out.println("Copied elements "+ ReverseArray[i]); }
		 */
		for(int i=0,j=l-1; i<l; i++,j--)
		{
			ReverseArray[j]=Array[i];	
		}
		
		System.out.println("Array A Elements "+ Arrays.toString(Array));
		System.out.println("Array A Elements Copied into Array C "+ Arrays.toString(CopyArray));
		System.out.println("Array A Elements Copied into Array B in reverse order "+ Arrays.toString(ReverseArray));
	}

}
