package Programming_Questions;

public class Reverse_Number {

	public static void reverse_And_sum_of_Number()
	{
		int k=567;
		int reverse=0;
		int sum=0;
		while(k>0)  //to make code as generic ,as for loop is used when we know how many iterations are needed 
		//for(int i=0 ;i<2;i++) as we are not aware how many iterations is should perform.
		{
			int reminder = k%10;
			reverse = reverse *10 + reminder; //reverse a number
			sum = sum + reminder; 	//sum of all digits
			k= k/10; //Quotient  - needs this to be run until value of n becomes 0.	
		}
		System.out.println("Reverse of number is "+ reverse );
		System.out.println("Sum of number is "+ sum );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_And_sum_of_Number();
		
	}

}
