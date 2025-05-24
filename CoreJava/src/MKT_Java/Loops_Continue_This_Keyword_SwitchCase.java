package MKT_Java;

public class Loops_Continue_This_Keyword_SwitchCase {

	//initial values of global variables
	int a=300;
	int b;
	float c=90.05f;
	double d= 567.89345;
	String e="Sujani" ;
	public static void WhileLoop()
	{
		int x=10;
		while(x<15)
		{
			System.out.println("while loop entered "+ x);
			x++;
		}

	}
	public static void do_WhileLoop()
	{
		int i = 0;
		do {
		  System.out.println("do-while loop entered "+ i);
		  i++;
		}
		while (i < 5);
	}
	public static void Continue_Keyword()
	{
		// For loop for iteration
        for (int i = 0; i <=5; i++)
        {
            // Check condition for continue
          	// skip the execution of loop when i==3                  
          	if (i == 3)
                continue;
          
            System.out.println("Continue Keyword " + i + " ");
        }
	}
	public  void this_Keyword(int z, int y,float x, double w,String u)
	{

		//when we want non-static local variables values to be set to global variables values then this keyword is used.
		//Disadvantage of this keyword is it can only be used in non-static methods
		this.a=z;
		this.b=y;
		this.c=x;
		this.d=w;
		this.e=u;
		
		
	}
	public static void SwitchCase()
	{
		int t=2;  //stops when break command is found.
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
	}
	
	public static void Infinite_loop()
	{
		int i;
		for(i=50;i>10;i++)
		{
			System.out.println("Increment infinite loop");
		}
		
		for(i=1;i<60;i--)
		{
			System.out.println("Decrement infinite loop");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops_Continue_This_Keyword_SwitchCase g=new Loops_Continue_This_Keyword_SwitchCase();
		g.this_Keyword(1000,4567,378.095f,675.345678,"Karuturi");
		System.out.println("after using This keyword");
		System.out.println("Value of int a is " + g.a);
		System.out.println("Value of int b is " + g.b);
		System.out.println("Value of Float c is " + g.c);
		System.out.println("Value of double d is " + g.d);
		System.out.println("Value of String e is " + g.e);
		
		WhileLoop();
		do_WhileLoop();
		Continue_Keyword();
		SwitchCase();
		Infinite_loop();
	}

}
