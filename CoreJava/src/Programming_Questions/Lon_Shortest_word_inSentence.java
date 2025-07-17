package Programming_Questions;

import java.util.ArrayList;
import java.util.List;

public class Lon_Shortest_word_inSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String u = "My hometown is tadipar"; 

        String[] words = u.split(" "); 

  

        List<String> longestWords = new ArrayList<>(); 

        List<String> shortestWords = new ArrayList<>(); 

  

        int maxLength = Integer.MIN_VALUE; 

        int minLength = Integer.MAX_VALUE; 

  

        System.out.println("Initial Max length is " + maxLength); 

        System.out.println("Initial Min length is " + minLength); 

        // Find max and min length 

        for (String word : words) { 

            int len = word.length(); 

  

            if (len > maxLength) { 

                maxLength = len; 

                longestWords.clear(); 

                longestWords.add(word); 

            } else if (len == maxLength) { 

                longestWords.add(word); 

            } 

  

            if (len < minLength) { 

                minLength = len; 

                shortestWords.clear(); 

                shortestWords.add(word); 

            } else if (len == minLength) { 

                shortestWords.add(word); 

            } 

        } 

  

        System.out.println("Longest word(s) of length " + maxLength + ": " + longestWords); 

        System.out.println("Shortest word(s) of length " + minLength + ": " + shortestWords); 

 
	}

}
