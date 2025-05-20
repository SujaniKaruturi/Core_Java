package InheritancePackage;

public class Student extends Teacher 
{

	static void cycle()
	{
		System.out.println("Cycle");
	}
	void library()
	{
		System.out.println("Library");
	}
	
	public static void main(String[] args) 
	{
		car();
		cycle();
		Student s= new Student();   //calling a non-static method of same child class(Student) and parent class(Teacher) as well
		s.library();
		s.room();

	}

}
