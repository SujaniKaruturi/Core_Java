package assignments_B45;

public class Ass_B45_SIB_IIB_Constructor {

	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	Ass_B45_SIB_IIB_Constructor()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new Ass_B45_SIB_IIB_Constructor();
	}

}
