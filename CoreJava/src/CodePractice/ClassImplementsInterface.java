package CodePractice;

interface First
{
	void mango();    //interface contains abstract method,which need not have abstract keyword infront of method name.
	void gent();
	
}
public class ClassImplementsInterface implements First
{

	
	public static void main(String[] args) 
	{
		ClassImplementsInterface c= new ClassImplementsInterface();
		c.mango();
		c.gent();
	}

	@Override
	public void mango() {
		System.out.println("non-static abstarct method:mango of First interface is defined");
		
	}

	@Override
	public void gent() {
		System.out.println("non-static abstarct method:gent of First interface is defined");

		
	}
	
	}
