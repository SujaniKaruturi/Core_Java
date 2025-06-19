package MKT_Java;

class MethodOverridingParent3
{
	void add(int a)
	{
		System.out.println("Addition 4");
	}
}
class MethodOverridingParent2 extends MethodOverridingParent3
{
	void add(int a)
	{   super.add(123);    
		System.out.println("Addition 3");
	}
}
class MethodOverrridingParent extends MethodOverridingParent2
{
	void add(int a)
	{   super.add(21);
		System.out.println("Addition 1");
	}
}
public class Method_Overriding_with_SuperKeyword extends MethodOverrridingParent {
     public void add(int a)
     {   super.add(46);
    	 System.out.println("Addition 2");
     }
	public static void main(String[] args) {
		Method_Overriding_with_SuperKeyword sa= new Method_Overriding_with_SuperKeyword();
		sa.add(34);

	}

}