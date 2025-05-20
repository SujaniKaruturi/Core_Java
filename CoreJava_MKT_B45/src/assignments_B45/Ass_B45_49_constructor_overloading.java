package assignments_B45;
//21.Create constructor and try to call them in main method
//22.Write a program to overload constructor
public class Ass_B45_49_constructor_overloading {

	Ass_B45_49_constructor_overloading()
	{
		System.out.println("Constructor with no parameter");
	}
	Ass_B45_49_constructor_overloading(int a)
	{
		System.out.println("Constructor Overloading with int parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass_B45_49_constructor_overloading n= new Ass_B45_49_constructor_overloading();
		new Ass_B45_49_constructor_overloading(6);	//another way to create object without reference variable
		
	}

}
