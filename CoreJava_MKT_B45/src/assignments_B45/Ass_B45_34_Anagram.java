package assignments_B45;

import java.util.Arrays;

public class Ass_B45_34_Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="Acer";	//String are case sensitive
		String s2="care";
		
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		System.out.println("Array a1" + Arrays.toString(a1));
		System.out.println("Array a2" + Arrays.toString(a2));
		
		Arrays.sort(a1);
		Arrays.sort(a2);;
		
		if(Arrays.equals(a1, a2))  	//||Arrays.equalsIgnoreCase(a1, a2) is not applicable
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println(" Not Anagram");
		}
		
	}

}
