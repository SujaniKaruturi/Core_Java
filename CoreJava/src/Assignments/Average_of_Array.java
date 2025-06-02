package Assignments;

public class Average_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		int b[]= {3,4,5,6,7};
		
		int sum =0;
		for(int i=0; i<b.length ; i++)
		{
			sum= sum + b[i];
			
		}
		System.out.println("sum is " + sum);
		float f= sum / b.length;
		System.out.println("Average is " + f);
		double reminder=sum%b.length;
		System.out.println(reminder);
	}

}
