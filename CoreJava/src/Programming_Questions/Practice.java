package Programming_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a map to store character counts
		 String input = "programming";

        Map<Character, Integer> countMap = new HashMap<>();

        // Convert string to char array and iterate
        for (char ch : input.toCharArray()) {
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
        }

        // Print character counts
        System.out.println("Character count in the string:");
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}

}
