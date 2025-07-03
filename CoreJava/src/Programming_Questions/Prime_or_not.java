package Programming_Questions;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		
		
			boolean isPrime=true;
			
			if(num<=1) 
			{
				isPrime=false;
			}
			else
			{
				for(int j=2; j<=Math.sqrt(num); j++)
				{
					if(num%j==0)
					{
						isPrime=false;
						break;
					}
				}
			}
			
			if(isPrime)
			{
				System.out.println(num+ " :is a prime number");
			}
			else
			{
				System.out.println(num+ " : is not a prime number");
			}
	}

	


	}


