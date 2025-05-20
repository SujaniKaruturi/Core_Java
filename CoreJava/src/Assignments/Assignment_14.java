package Assignments;
//Ass14. Nested if and if else statements
public class Assignment_14 
{

	public static void main(String[] args) 
	{
		int x=50;
		int y=60;
		int day = 4;
		if(day ==1)
		{
			System.out.println("Sunday");
		}
		else if(day ==2)
		{
			System.out.println("Monday");
		}	
		else if(day ==3)
		{
			System.out.println("Tuesday");
		}		
		else if(day ==4)
		{
			System.out.println("Wednesday");
		}	
		else 
		{
			System.out.println("Default");
		}
		if(x<100)
		{
			if(y==60)
			{
				System.out.println("Nested if Assignment");
			}
		}

	}

}
