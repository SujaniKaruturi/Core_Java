package assignments_B45;
//Super calling statement(SCS) is used to call from child class constructor to parent class constructor . 
//Output of SPC will from be top to bottom instead of bottom to top. 
class ParentClass_1
{
	ParentClass_1()
	{
		System.out.println("Parent class constructor with no parameters");
	}
	ParentClass_1(int a)
	{
		System.out.println("Parent class constructor with parameters");
	}
}
public class Ass_B45_60_Super_Calling_Statement extends ParentClass_1{
//super calling statement is called implicit and explicit also
	Ass_B45_60_Super_Calling_Statement()
	{
		//Implicitly called parent class  "no parameters- ParentClass_1 Constructor"
		System.out.println("Child class constructor with no parameters");
	}
	Ass_B45_60_Super_Calling_Statement(String y)
	{
		super(56);	//Explicitly calling parent class "Parameterized constructor - ParentClass_1(int a)"
		System.out.println("Child class constructor with  parameters");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			new Ass_B45_60_Super_Calling_Statement();
			new Ass_B45_60_Super_Calling_Statement("Sujani");
	}

}
