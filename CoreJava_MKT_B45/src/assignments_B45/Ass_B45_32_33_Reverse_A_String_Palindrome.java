package assignments_B45;

public class Ass_B45_32_33_Reverse_A_String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Malayalam";
		System.out.println("String is " + s  );
		String reverseString = "";
		char c[]=s.toCharArray();
		int charLength = c.length;
		
		for(int i=charLength-1;i>=0; i--)
		{
			reverseString = reverseString+c[i];
			//System.out.println("Each char String is " +reverseString );
		}
		System.out.println("Reverse String is" +reverseString );
		//s.equals(reverseString) - Malayalam - ismalayalaM not same  ,this is not palindrome. 
		if (s.equals(reverseString) || s.equalsIgnoreCase(reverseString)) //equalsIgnoreCase -ignores cases of letters
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");
		}
	}

}
