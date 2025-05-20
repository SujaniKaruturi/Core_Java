package CodePractice;

interface face1
{
	void good();
	
}
interface face2 extends face1
{
	void bad();
	
}
public class ClassImplementsInterfaceExtendsInterface implements face2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassImplementsInterfaceExtendsInterface j =new ClassImplementsInterfaceExtendsInterface();
		j.bad();
		j.good();
	}

	@Override
	public void good() {
		// TODO Auto-generated method stub
		System.out.println("good method from interface face1 ");
	}

	@Override
	public void bad() {
		// TODO Auto-generated method stub
		System.out.println("bad method from interface face2 ");
	}

}
