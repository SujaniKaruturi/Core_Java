package Programming_Questions;

public class Reverse_String_Sentence_Palindrome{

	public static void String_Reverse()
	{
		String s="Sujani";
		String output = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			output = output + s.charAt(i);
		}
		System.out.println("String Reverse is " + output);
		if(s.equalsIgnoreCase(output))
		{
			  System.out.println("String " + s + "is Palindrome"); 
		}
		else
		{
			System.out.println("String " + s + " is Not a Palindrome"); 
		}
		
		
		String s1="Madam";
		String s2=s1.toLowerCase();
		String output1 = "";
		
		for(int i=s2.length()-1; i>=0; i--)
		{
			output1 = output1 + s2.charAt(i);
		}
		System.out.println("String Reverse is " + output1);
		if(s2.equals(output1))
		//if(s1.equals(output1))
		{
			  System.out.println("String " + s2 + " is Palindrome"); 
		}
		else
		{
			System.out.println("String  " + s2 + " is Not a Palindrome"); 
		}
	}
	public static void reverse_Sentence()
	{
		String d="I love India";
		String words[]= d.split(" ");
		String reverse = "";

		for(int i = words.length-1;i>=0;i--)
		{
			reverse = reverse+words[i] + " ";
		}
		System.out.println("Reverse of Sentence " +d+ " is " +reverse); 
		
	}
	public static void String_Reverse_Using_StringBuilder()
	{
		String s="Madam";
		StringBuilder output = new StringBuilder(s);
		String reverse = output.reverse().toString();
		System.out.println("String Reverse using StringBuilder is " + output);
	
		String s4="Malayalam";
		char c[]=s4.toCharArray();
		StringBuilder reverseString2 = new StringBuilder();
		for (int i = c.length - 1; i >= 0; i--) {
		    reverseString2.append(c[i]);
		}
		System.out.println("Reverse String is " +reverseString2 );
		//if(s.equalsIgnoreCase(output))   
		//gives compile time error ,as string and string builder cannot be compared,
		//so we need to change output to String using toString().
		if(s.equalsIgnoreCase(reverse))
		{
			  System.out.println("Stringbuilder " + s + " is Palindrome"); 
		}
		else
		{
			System.out.println("Stringbuilder " + s + " is not a Palindrome"); 
		}
	}
	public static void main(String[] args)
	{
		String_Reverse();
		String_Reverse_Using_StringBuilder();
		reverse_Sentence();
	}

}
