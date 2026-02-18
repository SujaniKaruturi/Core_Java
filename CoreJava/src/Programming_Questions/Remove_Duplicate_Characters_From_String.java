package Programming_Questions;

public class Remove_Duplicate_Characters_From_String {

	public static void CountofCharactersinString(String word,char character)
	{
		int count =0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)== character)
			{
				count++;
			}
		}
		 System.out.println("Count of Character " + character + " is "   + count); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountofCharactersinString("shdgasdahsashasd" , 's');
		 	String input = "automation"; 
		 	char char_array[]=input.toCharArray();
		 	
	        StringBuilder output = new StringBuilder(); 
	        
	        for (char ch : char_array) {
	        	 
	        	//need more clarity
	            if (output.indexOf(String.valueOf(ch)) == -1) { 
	                output.append(ch); 
	            } 
	        }
	        System.out.println("Without duplicates: " + output); 
	}

}
