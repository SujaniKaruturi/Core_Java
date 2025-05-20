package assignments_B45;

public class Ass_B45_68_T0_76_StringMethod_Assignments {

	public void assignment_68()
	{
		String s2="Manish";
		System.out.println("String before replacement is " + s2);
		String s3= s2.replaceAll("h","Z");	
		//As string is immutable ,replaced string need to be stored in new string variable.
		System.out.println("String after replacement is " + s3);
	}
	public void assignment_69()
	{
		String q2="Manish Tiwari";
		System.out.println("String before replacement is " + q2);
		String q3= q2.replaceAll("Tiwari","Kumar");	
		//As string is immutable ,replaced string need to be stored in new string variable.
		System.out.println("String after replacement is " + q3);
	}
	public void assignment_70()
	{
		// Remove all the numeric values	
		String q2="Man&is*h T@iwa#ri";
		System.out.println("String before replacement is " + q2);
		String q3= q2.replaceAll("[0-9]","");	//capital alphabets will not be removed
		//As string is immutable ,replaced string need to be stored in new string variable.
		System.out.println("String after removeing all numeric values from string is " + q3);
	}
	public void assignment_71()
	{
		// Remove all the alphabets	
		String q2="1Ma456n&is*h T@i62wa23#ri0";
		System.out.println("String before replacement is " + q2);
		String q3= q2.replaceAll("[a-z]","");	//capital alphabets will not be removed
		//As string is immutable ,replaced string need to be stored in new string variable.
		System.out.println("String after removeing all alphabets from string is " + q3);
	}
	public void assignment_72()
	{
		// Remove all the Capital Letters	
		String q2="1Ma456N&Is*H T@i62Wa23#Ri0";
		System.out.println("String before replacement is " + q2);
		String q3= q2.replaceAll("[A-Z]","");	//capital alphabets will not be removed
		//As string is immutable ,replaced string need to be stored in new string variable.
		System.out.println("String after removeing all Capital Letter from string is " + q3);
	}
	public void assignment_73()
	{
		//Check if given string ends with letter 'i'
		String name="Sujani";
		boolean result = name.matches("(.*)I"); //result is false as string is case sensitive
		boolean result2 = name.matches("(.*)i");
		if(result2)
		{
			System.out.println("String ends with i");
		}
		System.out.println("String doesnot ends with i");
	}
	static void Assignment74()
	{
		// Check if string starts with 'A'
		String name="AshvinI";
		boolean result = name.matches("A(.*)");
		if(result)
		{
			System.out.println("String Starts with A");
		}
	}
	static void Assignment75()
	{
		// Check if string contains 'a'
		String name="AshvanI";
		boolean result = name.matches("(.*)a(.*)");
		if(result)
		{
			System.out.println("String Contains a");
		}
	}
	static void Assignment76()
	{
		// Check if string has exact 4 chars
		String name="Rani";
		//String lname="World";
		boolean result = name.matches("....");
		boolean result2 = name.matches("....");
		if(result)
		{
			System.out.println("String has exact 4 characters");
		}
		else if(result2)
		{
			System.out.println("String has exact 4 characters");
		}
		else
		{
			System.out.println("String has more than 4 characters");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass_B45_68_T0_76_StringMethod_Assignments h =new Ass_B45_68_T0_76_StringMethod_Assignments();
		h.assignment_68();
		h.assignment_69();
		h.assignment_70();
		h.assignment_71();
		h.assignment_72();
		h.assignment_73();
		Assignment74();
		Assignment75();
		Assignment76();
		
	}

}
