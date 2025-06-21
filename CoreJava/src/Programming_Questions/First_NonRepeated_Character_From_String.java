package Programming_Questions;

public class First_NonRepeated_Character_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "automation"; 
        for (char ch : str.toCharArray())
        { 
        	System.out.println("First index: " + str.indexOf(ch));
        	System.out.println("last index: " + str.lastIndexOf(ch));
        	//Indexing:
        	//0 1 2 3 4 5 6 7 8 9
        	//a u t o m a t i o n
            if (str.indexOf(ch) == str.lastIndexOf(ch)) 
            { 
                System.out.println("First non-repeated: " + ch); 
                break; 
            } 
        } 
	}

}
