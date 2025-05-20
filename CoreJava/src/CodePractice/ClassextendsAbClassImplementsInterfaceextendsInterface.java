package CodePractice;

interface face3
{
	void good();
	
}
interface face4 extends face3
{
	void bad();
	
}
abstract class Abclass6 implements face4
{

	abstract void joke();    //good, bad methods of above interfaces can also be over ridden i this abstract class as well,
							//best practice is to define the methods in parent itself rather than child.
	
	static void sogood() {
		// TODO Auto-generated method stub
		System.out.println("sogood is a static method from Abclass6 (Abstract Class)");
	}

	void sobad() {
		// TODO Auto-generated method stub
		System.out.println("sobad is a non-static  method from Abclass6(Abstract Class)  ");
	}

}

public class ClassextendsAbClassImplementsInterfaceextendsInterface extends  Abclass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassextendsAbClassImplementsInterfaceextendsInterface t= new ClassextendsAbClassImplementsInterfaceextendsInterface();
		t.bad();
		t.good();
		t.sobad();
		sogood();
		t.joke();
	}

	@Override
	void joke() {
		// TODO Auto-generated method stub
		System.out.println("joke method is abstract method from Abclass6 ");
	}

	@Override
	public void bad() {
		// TODO Auto-generated method stub
		System.out.println("bad method from interface face4 ");
	}

	@Override
	public void good() {
		// TODO Auto-generated method stub
		System.out.println("good method from interface face3 ");
	}

}
