package CodePractice;

import java.util.Arrays;

public class Arrayaverage {

	public static void main(String[] args) {
		int b[]=new int[3];  //diff way of declaring array
		b[0]=1;
		b[1]=56;
		b[2]=67;
		System.out.println(Arrays.toString(b));   //print entire array
		System.out.println("2nd element from array  " + b[1]);
		int a[]= {5,10,15,20,25};
		int l=a.length;
		int sum=0;
		System.out.println("Length " + l);
		for(int i=0;i<l;i++)
		{
			sum=sum+a[i];
			//System.out.println("sum " + sum);
		}
		System.out.println("sum " + sum);
	int average=sum/4;
	System.out.println("average " + average);
	}

}
