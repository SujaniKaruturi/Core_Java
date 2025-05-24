package MKT_Java;

interface interface_1
{
	void method1();
	//static void method2(); //No static methods should be present in interface
	void method3(int a);
	
}
public class Interface implements interface_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface u =new Interface();
		u.method1();
		u.method3(6);
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1 from inteface is overridden with no parameters");
	}

	@Override
	public void method3(int n) {
		// TODO Auto-generated method stub
		System.out.println("Method2 from inteface is overridden with paramters");
	}

}
