package CodePractice;

import java.util.Arrays;

public class StringProblems {
	
	public static void countCharacters() {
		String str="Hi! Welcome to Automation Class!!";
		char[] StringArray = str.toCharArray(); //converting into char
		int count =0;
		for(int i=0;i<=StringArray.length-1;i++)
		{
			if(StringArray[i]!=' ')
			{
				count++;
			}
		}
		int count1=0;
		/*
		 * for (int i=0;i<=str.length()-1;i++) { if(str.charAt(i) != ' ') //converting
		 * into char { count1++; } }
		 */
		
		for(char ch: StringArray)    //Enhanced for each loop
		{
			if(ch != ' ')
			{
				count1++;
			}
		}
		System.out.println(count1);
		System.out.println(count);
	}
	public static StringBuilder reverseOfString(String str)   //String Reverse using StringBuilder function
	{
		char[] StringArray =str.toCharArray();
		StringBuilder reversed =new StringBuilder("");
		
		for(int i=StringArray.length-1 ;i>0;i--)
		{
			reversed =reversed.append(StringArray[i]);
		}
		System.out.println(reversed);
		return reversed;
	}
	
	public static void palindrome(String str)    //Ex:madam, radar
	{
		StringBuilder revString = reverseOfString(str);
		if(str.contentEquals(revString))
		{
			System.out.println("String is a palindrome");
		}
		
	}
	public static void anagram(char[] str1,char[] str2)   // Ex: care  -->acer ,length should be same
	{
		int n1=str1.length;
		int n2=str2.length;
		
		if(n1!=n2)  //When string length are not same ,then they cannot be anagram
		{
			System.out.println("Not Anagram");
		}
		//sort the strings
		Arrays.sort(str1);
	    Arrays.sort(str2);
	    
	    for(int i=0;i<n1;i++)
	    {
	    	if(str1[i]!=str2[i])
	    	{
	    		System.out.println("Not Anagram");
	    	}
	    	System.out.println("Anagram");
	    }
	}
	public static void anagram2()   // Ex: care  -->acer ,length should be same
	{
		String s1="Acer";
		String s2="care";
		
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		System.out.println("Array a1" + Arrays.toString(a1));
		System.out.println("Array a2" + Arrays.toString(a2));
		
		Arrays.sort(a1);
		Arrays.sort(a2);;
		
		if(Arrays.equals(a1, a2)) 
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println(" Not Anagram");
		}
		
	}
	public static void reverseOrderOfWords(String input)
	{
		String s[]=input.split(" ");
		String ans="";
		for(int i=s.length-1; i>=0;i--)
		{
			ans +=s[i] + " ";
		}
		System.out.println("Reversed strings " + ans);
	}
	 //learn about peakelement
	public static void main(String[] args) 
	{
		
		countCharacters();
		reverseOfString("Sujani");
		palindrome("madam");
		//anagram("acer","care");
		anagram2();
		reverseOrderOfWords("Welcome to my home");
	}
		
		
	}


