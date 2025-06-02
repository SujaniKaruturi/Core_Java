package Assignments;

import java.util.Arrays;

public class Array_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[]= {3,4,5,6,7};
		int copy[] = new int[b.length];
		for(int i=0; i<b.length ; i++)
		{
			copy[i]=  b[i];
		}
		System.out.println("The new Array is:");
		 System.out.println(Arrays.toString(copy) );
		 System.out.println("The old Array is:");
		 System.out.println(Arrays.toString(b) );
	}

}
