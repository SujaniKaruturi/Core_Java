package Programming_Questions;

import java.util.Arrays;

public class Count_of_EachCharacter_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation";
        int[] count = new int[256]; // ASCII size

        // Convert to lowercase to count 'A' and 'a' as same, if needed
        str = str.toLowerCase();
        need to unerstnd this more clearly

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        System.out.println("value of count is " + Arrays.toString(count));

        // Print characters with frequency
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " : " + count[i]);
            }
        }
	}

}
