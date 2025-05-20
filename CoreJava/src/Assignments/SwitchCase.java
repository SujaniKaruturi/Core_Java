package Assignments;
//Ass 40. Switch case program
public class SwitchCase 
{
	
	public static void main(String[] args) 
	{
		/*
		int s=5;
		switch(s)
		{
			case 1:System.out.println("Sunday"); break;
			case 2:System.out.println("Monday"); break;
			case 3:System.out.println("Tuesday"); break;
			case 4:System.out.println("Wednesday"); break;
			case 5:System.out.println("Thrusday"); break;
			case 6:System.out.println("Friday"); break;
			case 7:System.out.println("Saturday"); break;
		}
		*/ //as there is break after thrusday, execution will continue till Thursday and stops at it.
		int t=1;
		switch(t)
		{
			case 1:System.out.println("Sunday"); 
			case 2:System.out.println("Monday"); 
			case 3:System.out.println("Tuesday"); 
			case 4:System.out.println("Wednesday"); 
			case 5:System.out.println("Thrusday"); break;
			case 6:System.out.println("Friday"); break;
			case 7:System.out.println("Saturday"); break;
			default: System.out.println("no day is selected");
		}
		
					
		/*
		String t = "t";
		switch(t)    //This way is not possible in switch case. Passing String variable as input to switch case.
		
		float e=4.0f;
		switch(e)
		*/
		/*
		String input = "Sunday";
		switch(input)   
		{
			case a :System.out.println("Sunday"); break;
			case b :System.out.println("Monday"); break;
			case c:System.out.println("Tuesday"); break;
			case d:System.out.println("Wednesday");
			case e:System.out.println("Thrusday"); 
			case f:System.out.println("Friday"); 
			case g:System.out.println("Saturday");
		}
		*/

	}

}
