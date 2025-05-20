package assignments_B45;
//WAP where 3 parameterized static ,non-static methods along with 3 constructirs and call them
public class Ass_B45_9_static_NonStatic_const_parameterized {

	Ass_B45_9_static_NonStatic_const_parameterized(String city)
	{
		System.out.println("City is " + city);
	}
	Ass_B45_9_static_NonStatic_const_parameterized(int doorno)
	{
		System.out.println("Doorno is " + doorno);
	}
	Ass_B45_9_static_NonStatic_const_parameterized(String buildingname,int pin)
	{
		System.out.println("Address is " + buildingname + pin);
	}
	
	public static void staticMethod1(float salary)
	{
		System.out.println("Salary is " + salary);
	}
	public static void staticMethod2(String fname,String lname)
	{
		System.out.println("Name is " + fname +lname);
	}
	public static void staticMethod3(String mobno)
	{
		System.out.println("MobNo is " + mobno);
	}
	public void nonStaticMethod1(int age)
	{
		System.out.println("Age is " + age);
	}
	public void nonStaticMethod2(String dob)
	{
		System.out.println("DOB is " + dob);
	}
	public void nonStaticMethod3(char gender)
	{
		System.out.println("Gender is " + gender);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ass_B45_9_static_NonStatic_const_parameterized l=new Ass_B45_9_static_NonStatic_const_parameterized("Ameenpur");
		new Ass_B45_9_static_NonStatic_const_parameterized(224);
		new Ass_B45_9_static_NonStatic_const_parameterized("Ratna sudha , ", 502033);
		l.nonStaticMethod1(25);
		l.nonStaticMethod2("12-3-2009");
		l.nonStaticMethod3('M');
		staticMethod1(150000.567f);
		staticMethod2("Sujani ", "Karuturi");
		staticMethod3("9867432190");
		
		
	}

}
