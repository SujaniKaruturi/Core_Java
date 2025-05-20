package Assignments;
//Ass18 . Constructor Overloading
public class ConstructorOverloading
{
	ConstructorOverloading()
	{
		System.out.println("ConstructorOverloading 1");
	}
	
	ConstructorOverloading(int a, String b)
	{
		a=90;
		System.out.println("value of a is " + a);  //initial value of a is 100,but 'a' value is overwritten by local value of a i.e 90.
		System.out.println("ConstructorOverloading 2");
	}
	/*ConstructorOverloading(String a,int b)    //Same order of parameters is not possible in overloading i.e 3 and 4 order of parameters is same.
	{
		System.out.println("ConstructorOverloading 3");
	}*/
	ConstructorOverloading(String b,int a)
	{
		System.out.println("ConstructorOverloading 4");
	}
	ConstructorOverloading(int a, String b,char c,double d)
	{
		System.out.println("ConstructorOverloading 5");
	}
	public static void main(String[] args)
	{
		new ConstructorOverloading();  //another way of object creation but we will not able to call non-static method without reference variables
		ConstructorOverloading c1= new ConstructorOverloading(100,"Mumbai");
		ConstructorOverloading c2= new ConstructorOverloading("Hyderabad",1);  //reference variable is not used here so better to create object without ref variable 
		ConstructorOverloading c3= new ConstructorOverloading(3,"Bangalore", 'S', 3.145);
		new ConstructorOverloading("Hyderabad",1);   //another way to create object without reference variable
		int i;
		for(i=1;i<100;i++)
		{
			new ConstructorOverloading("Hyderabad",1); 
			System.out.println(i);
		}

	}

}
