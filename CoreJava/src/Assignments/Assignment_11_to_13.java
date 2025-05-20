package Assignments;
/*
 Ass11_13. Logical AND ,OR, Not Logical operator
 Ass16. Comparison operators
 */
public class Assignment_11_to_13
{

	public static void main(String[] args)
	{
		int a=100;
		int b=500;
		if(a<=b && b!=400)
		{
			System.out.println("AND operation is performed");
		}
		if(a==700 || b>a)
		{
			System.out.println("OR operation is performed");
		}
		if(a!=500)
		{
			System.out.println("NOR operation is performed");
		}	
		

	}

}
