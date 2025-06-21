package Programming_Questions;

public class Remove_Duplicate_Characters_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String input = "automation"; 
		 	char char_array[]=input.toCharArray();
		 	
	        StringBuilder output = new StringBuilder(); 
	        
	        for (char ch : char_array) {
	        	System.out.println(String.valueOf(ch)); 
	        	need more clarity
	            if (output.indexOf(String.valueOf(ch)) == -1) { 
	                output.append(ch); 
	            } 
	        }
	        System.out.println("Without duplicates: " + output); 
	}

}
