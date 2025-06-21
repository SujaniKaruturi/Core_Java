package Programming_Questions;

import java.util.Arrays;

public class First_Letter_From_StringofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = "Boy is good"; 
    String output = ""; 
    String words[] = s.split(" "); 
    System.out.println("Array of words: " + Arrays.toString(words)); 

    for(int i = 0; i < words.length; i++)  
    { 
        output = output + words[i].charAt(0); 
    } 
    System.out.println("First letter of String is: " + output); 
}
}
