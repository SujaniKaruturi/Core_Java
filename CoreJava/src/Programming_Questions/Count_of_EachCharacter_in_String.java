package Programming_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count_of_EachCharacter_in_String {

	public static void countand_SecondMostduplicateElement_Using_Map()
	{
		 String input = "automation testing";
	        input = input.toLowerCase();

	        Map<Character, Integer> charCount = new HashMap<>();

	        // Step 1: Count character occurrences
	        for (char c : input.toCharArray()) {
	            if (c != ' ') {  // skip spaces
	                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	            }
	        }
	        
	        

	        // Step 2: Sort map entries by value in descending order
	        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(charCount.entrySet());
	        sortedList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

	        // Step 3: Print character counts
	        System.out.println("Character Frequencies:");
	        for (Map.Entry<Character, Integer> entry1 : sortedList) {
	            System.out.println(entry1.getKey() + " = " + entry1.getValue());
	        }

	        // Step 4: Get second most frequent character
	        if (sortedList.size() >= 2) {
	            char secondChar = sortedList.get(1).getKey();
	            int secondFreq = sortedList.get(1).getValue();
	            System.out.println("\nSecond most frequent character: " + secondChar + " (occurs " + secondFreq + " times)");
	        } else {
	            System.out.println("Not enough unique characters to determine second most frequent.");
	        }
	        
	}
	public static void countofcharacters_using_Array()
	{
		String str = "Automation";
        int[] count = new int[256]; // ASCII size

        // Convert to lowercase to count 'A' and 'a' as same, if needed
        str = str.toLowerCase();
       // need to unerstnd this more clearly

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        System.out.println("value of count is " + Arrays.toString(count));

        // Print characters with frequency
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + " : " + count[i]);
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countand_SecondMostduplicateElement_Using_Map();
		countofcharacters_using_Array();
	}

}
