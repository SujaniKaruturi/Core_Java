package Practice_Interview_Questions;

public class Reverse_A_String_Palindrome {

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
		
		StringBuilder reverseString2 = new StringBuilder();
		
		for (int i = charLength - 1; i >= 0; i--) {
		    reverseString2.append(c[i]);
		}
		System.out.println("Reverse String is" +reverseString2 );
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
