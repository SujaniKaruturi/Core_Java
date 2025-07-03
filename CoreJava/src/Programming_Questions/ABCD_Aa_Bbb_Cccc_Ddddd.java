package Programming_Questions;

public class ABCD_Aa_Bbb_Cccc_Ddddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
