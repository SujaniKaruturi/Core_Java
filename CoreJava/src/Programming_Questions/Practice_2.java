package Programming_Questions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_2 {

	public static void AAA_BB_CCC_DD_A3_B2_C3_D2()
	{
		String input = "AAABBCCCDD";
		char c[]=input.toCharArray();
		StringBuilder output = new StringBuilder();
		int count=1;
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]==c[i+1])
			{
				count++;
			}
			else
			{
				output.append(c[i]).append(count);
				count=1;	
			}
		}
		output.append(c[c.length-1]).append(count);
		System.out.println(output);
	}
	public static void count_eachcharacter_in_String()
	{
		String input="Automation Testing";
		char arr[]=input.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for (char c : arr) {
            if (c != ' ') {  // skip spaces
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }  
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println("key is " + entry.getKey() + " value is "+ entry.getValue());
		}
		
		Set<Integer> set=new HashSet<Integer>(map.values());
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list,Collections.reverseOrder());
		 System.out.println("List of sorted values is " + list); 
		
		 if(list.size()>=2)
		 {
			 System.out.println("List of sorted values is " + list.get(1)); 
		 }
		
		
	}
	public static void duplicate_character()
	{
		String input = "Automation Testing";
		char arr[]=input.toCharArray();
		StringBuilder output = new StringBuilder();
		Set<Character> duplicate =new HashSet();
		for(char c:arr)
		{
			if(duplicate.add(c))
			{
				output.append(c);
			}
		}
		System.out.println("Original: " + input); 
		System.out.println("Without duplicates: " + output); 
	}
	public static void non_repeated_Character()
	{
		String input= "automation";
		char arr[]=input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(input.indexOf(arr[i]) ==input.lastIndexOf(arr[i]))
			{
				System.out.println(arr[i]);  
				break;  
			}
		}
	}
	public static void largetsnuminarray()
	{
		int a[]= {34,67,21,12,98,47};
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println(largest);  
		
		Arrays.sort(a);
		int largest1 = a[a.length-1];
		System.out.println("First largest using arrays sorting: " + largest1); 
	}
	public static void secondlargestinarray()
	{
		int a[]= {34,67,21,12,98,47};
		int largest=0;
		int second =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				second=largest;
				largest=a[i];
			}
			if(a[i]>second && a[i]!=largest)
			{
				second=a[i];
			}
		}
		System.out.println("First largest using arrays sorting: " + largest + " " + second); 
	}
	public static void firstletterfromString()
	{
		String input="Boy is good";
		String words[]=input.split(" ");
		String output = "";
		
		for(int i =0 ; i<words.length;i++)
		{
			output=output+words[i].charAt(0);
		}
		System.out.println("joined word is " + output);
	}
	public static void prime()
	{
		LocalDate current =LocalDate.now();
		LocalDate future=current.plusDays(4);
		LocalDate previous=current.minusDays(4);
		System.out.println("current date" + current);
		System.out.println("future date" + future);
		System.out.println("previous date" + previous);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = current.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
		int num=7;
		boolean prime=true;
		if(num<=1)
		{
			prime=false;
		}
		else
		{
			for(int i=2;i<Math.sqrt(num);i++)
			{
				if(num%i == 0)
				{
					prime=false;
				}
			}
			
		}
		if(prime)
		{
			System.out.println("num is prime " + num);
		}
		else
		{
			System.out.println("num is not prime " + num);
		}
		
	}
	public static void ABCD_Aa_Bbb_Cccc_Ddddd()
	{
		 String input = "ABCD";
	        char[] chars = input.toCharArray();  // Convert string to char array
	        String result = "";

	        for (int i = 0; i < chars.length; i++)
	        {
	            // First character uppercase
	            result = result + Character.toUpperCase(chars[i]);
	            // Add lowercase repeated (i) times
	            for (int j = 0; j < i; j++)
	            {
	                result= result +  Character.toLowerCase(chars[i]);
	            }
				  // Add underscore if not the last character
	            if (i < chars.length - 1) {
				  result = result + "_"; } 
	        }
	        System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA_BB_CCC_DD_A3_B2_C3_D2();
		count_eachcharacter_in_String();
		duplicate_character();
		non_repeated_Character();
		largetsnuminarray();
		secondlargestinarray();
		firstletterfromString();
		prime();
		ABCD_Aa_Bbb_Cccc_Ddddd();
	}

}
