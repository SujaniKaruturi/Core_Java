package CodePractice;
interface fig
{
	void jamun();
}
class Hero implements fig
{
	void zero()
	{
		System.out.println("zero method from class Hero ");
	}
	void zero2()
	{
		System.out.println("zero2 method from class Hero ");
	}
	@Override
	public void jamun() {
		// TODO Auto-generated method stub
		
			System.out.println("jamun method from interface fig is been overridden ");	
			
	}
	
}
public class ClassExtendsClassImplementsInterface extends Hero
{  
	//jamun method can also be over ridden this child class as well

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassExtendsClassImplementsInterface s= new ClassExtendsClassImplementsInterface();
		s.zero();
		s.zero2();
		s.jamun();
		
	}

}
