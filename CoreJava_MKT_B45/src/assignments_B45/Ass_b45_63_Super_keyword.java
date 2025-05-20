package assignments_B45;
//Super keyword will help us to get the parent class implementation together with the child class implementation. 
//Super keyword has to be used in case of method over ridding concept only,used in non-static methods only. (inheritence concept)

class Parent_Class
{
	void parent_Method()
	{
		System.out.println("parent_Method without parameter");
		
	}
	void parent_Method(int a)
	{
		System.out.println("parent_Method with int parameter "+a);
	}
}
public class Ass_b45_63_Super_keyword  extends Parent_Class{

	void parent_Method()
	{
		System.out.println("Child_Method without parameter");
		super.parent_Method();
	}
	void parent_Method(int a)
	{
		System.out.println("Child_Method with int parameter "+a);
		super.parent_Method(50);
	}
	public static void main(String[] args) 
	{
		Ass_b45_63_Super_keyword obj = new Ass_b45_63_Super_keyword();
		obj.parent_Method();
		obj.parent_Method(30);

	}

}
