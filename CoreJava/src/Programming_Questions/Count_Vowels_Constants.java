package Programming_Questions;

public class Count_Vowels_Constants {

	public static void vowelsConstants()
	{
		String f="Sujani";
		char d[]=f.toCharArray();
		int vowels=0;
		int constants = 0;
		// Convert to lowercase to handle both uppercase and lowercase letters
	    f= f.toLowerCase();
	    // Remove spaces
	    f = f.replaceAll(" ", "");
		for(char ch:d)
		{
			if(Character.isLetter(ch)) 
			{
				how to write using "aeiuou".contains 
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowels++;
	            } 
				else 
				{
					constants++;
	            }	
			}
		}
		System.out.println("Vowels: " + vowels + ", Consonants: " + constants); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelsConstants();
	}

}
