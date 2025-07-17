package Programming_Questions;

import java.util.Arrays;

public class Practice_For_interview {

	static String input="Automation Testing";
	public static void reverse_String() 
	{
		String output= "";
		for(int i=input.length()-1;i>=0;i--)
		{
			output=output+input.charAt(i);
		}
		System.out.println("Reversed String is " + output);
	}
	
	public static void reverse_Sentence() 
	{
		String output= "";
		String words[]=input.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
		{
			output=output+words[i] + " ";
		}
		System.out.println("Reversed Sentence is " + output);
	}

	public static void reverse_char_inWords()
	{
		String output="";
		String words[]=input.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			System.out.print(" ");
			for(int j=word.length()-1;j>=0;j--)
			{
				output = output + word.charAt(j);
			}
			if(i<words.length-1) 
			{ 
			output =output + " "; 
			} 
		}
		System.out.println("Reversed charcters in same sentence is " + output);
	}
	public static void reverse_sentence_and_char()
	{
		String output="";
		String words[]=input.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			String word = words[i];
			System.out.print(" ");
			for(int j=word.length()-1;j>=0;j--)
			{
				output = output + word.charAt(j);
			}
			if(i>0) 
			{ 
			output =output + " "; 
			} 
		}
		System.out.println("Reversed charcters in same sentence is " + output);
	}
	public static void reverse_Number()
	{
		int input=234;
		int reverse=0;
		int sum=0;
		while(input>0)
		{
			int remainder = input%10;
			reverse =   reverse*10 +remainder ;
			input = input/10;
			sum =sum +remainder;
		}
		System.out.println("Reversed number is " + reverse);
		System.out.println("Sum of all numbers " + sum);
	}
	public static void anagram()
	{
		String s1="silent";
		String s2="Listen";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}
	}
	public static void count_Vowels_consonants()
	{
		int vowels=0;
		int consonants=0;
		String input="Automation".toLowerCase();
		char c[]=input.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			
			 if (Character.isAlphabetic(c[i]))
			{
				 //if("aeiou".contains(c +""))
					 if("aeiou".contains(String.valueOf(c[i])))
				 {
					 vowels++;
				 }
				 consonants++;
			}
		}
		System.out.println("Count of vowels is " + vowels + " and consonants is " + consonants);
	}
	public static void print_Star1()
	{
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("Second star  ");
		for(int i=rows;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
		System.out.println("third star  ");

        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
	}
	public static void fibnocci_Series()
	{
		int a=0;
		int b=1;
		//int sum=a+b;
		int i=1;
		while(i<13)
		{
			int sum =a+b;
			 System.out.print( a +" " );
			a=b;
			b=sum;
			i++;	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_String();
		reverse_Sentence();
		reverse_char_inWords();
		reverse_sentence_and_char();
		reverse_Number();
		anagram();
		count_Vowels_consonants();
		print_Star1();
		fibnocci_Series();
	}

}
