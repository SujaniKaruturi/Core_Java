package Programming_Questions;

public class String_ends_With_Particular_Character {

	public static void main(String[] args) {
		//Check if given string ends with letter 'i'
				String name="Sujani";
				boolean result = name.matches("(.*)I"); //result is false as string is case sensitive
				boolean result2 = name.matches("(.*)i");
				if(result)
				{
					System.out.println("String ends with i");
				}
				else
				{
					System.out.println("String doesnot ends with i");	
				}
				
	}

}
