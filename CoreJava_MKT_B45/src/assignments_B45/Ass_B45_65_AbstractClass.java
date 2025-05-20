package assignments_B45;

abstract class Abstract_Class_1
{
	abstract void method1();
	abstract void method2();
	public void concrete_method1()
	{
		System.out.println("Non-static Concrete method 1");
	}
	static void concrete_method2()
	{
		System.out.println("Static Concrete method 2");
	}
	
}
public class Ass_B45_65_AbstractClass extends Abstract_Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass_B45_65_AbstractClass i = new Ass_B45_65_AbstractClass();
		i.concrete_method1();
		concrete_method2();
		i.method1();
		i.method2();
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method1 is implemented in child class");
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method2 is implemented in child class");
	}

}
