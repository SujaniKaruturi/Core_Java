package Practice_Interview_Questions;

public class count_noOf_Words_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "Java Selenium Automation";
	        System.out.println("Input → \"" + input + "\"");

	        // Trim the input to remove leading/trailing spaces and split by space
	        String[] words = input.trim().split("\\s+");
	   
	        // Count the words
	        int wordCount = words.length;

	        // Output the result
	        System.out.println("Number of words: " + wordCount);
	}

}
