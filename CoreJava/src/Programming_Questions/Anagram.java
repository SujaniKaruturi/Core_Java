package Programming_Questions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String s1 = "listen"; 
	        String s2 = "silent"; 

	        char[] a1 = s1.toCharArray(); 
	        char[] a2 = s2.toCharArray(); 
	        
	        Arrays.sort(a1); 
	        Arrays.sort(a2); 
	        
	        if(Arrays.equals(a1, a2))
	        {
	        	System.out.println("Strings " +s1+ " " + s2+ " are Anagrams" ); 
	        }
	        else
	        {
	        	System.out.println("Strings " +s1+ " " + s2+ " are not Anagrams" ); 
	        }
	        
	}

}
