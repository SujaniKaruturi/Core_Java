package assignments_B45;
//check if main method can be overloaded by making sure other main methods are static and non-static both
public class Ass_B45_22_Mainmethod_overloading {

	public static void main()  //static main method
	{
		System.out.println("static main method with no parameters");
	}
	public static void main(String name)  //static main method
	{
		System.out.println("static main method with parameters");
	}
	public void main2() 	//non-static main method,as already static main with no parameters is present,
							//i cannot use same method name as "main",so renamed to main2
	{
			System.out.println("non-static main method with no parameters");
	}
	public void main(int a) 	//non-static main method
	{
		System.out.println("non-static main method with parameters");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method ");
		main();
		main("Sujani");
		Ass_B45_22_Mainmethod_overloading v=new Ass_B45_22_Mainmethod_overloading();
		v.main2();
		v.main(32345);
		
	}

}
