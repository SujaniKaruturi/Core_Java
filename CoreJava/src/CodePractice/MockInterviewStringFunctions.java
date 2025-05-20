package CodePractice;

public class MockInterviewStringFunctions {

	public static void main(String[] args) {
		String s="POOOP";
		System.out.println(s.substring(3));		//3 is starting index
		System.out.println(s.substring(2,4));  //n,n-1
		int l=s.length();
		System.out.println("String length is "+l);
		String output="";
		for(int i=l-1; i>=0; i--)		//Reverse of string
		{
			char c=s.charAt(i);
			output=output+c;
		}
		System.out.println("Reversed of string is "+ output);
		boolean b1= s.equals(output);
		if (b1==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");
		}
		//String -immutable
		String k="Sujani";		//index starts from 0
		System.out.println("String Vaue is before concat is " +k);
		String s2= k.concat(" Karuturi");
		System.out.println("String after Concatination " +s2);
		System.out.println("String is immutable which is not changable even we concat ,it is same " +k);
		
		//String Buffer - mutable
		StringBuffer h=new StringBuffer("Sujani");
		System.out.println("String Buffer value " +h);
		h.append(" Karuturi");
		System.out.println("StringBuffer is mutable which is changable after we concat ,String is changed to " +h);
		System.out.println("String Reverse using String buffer " + h.reverse());
		
	}

}
