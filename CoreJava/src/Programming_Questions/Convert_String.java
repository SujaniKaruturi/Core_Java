package Programming_Questions;

public class Convert_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "AAABBCDD"; 
		//String s2="";
        StringBuilder output = new StringBuilder(); 
        int count = 1; 
        char[] arr = input.toCharArray(); 

        for (int i = 0; i < arr.length - 1; i++) { 
            if (arr[i] == arr[i + 1]) 
            { 
                count++; 
            } 
            else 
            { 
            	//s2.concat(arr[i]).append(count); doesn't work as array and string cannot concat
                output.append(arr[i]).append(count); 
                count = 1; 
            } 
        } 
        output.append(arr[arr.length - 1]).append(count); 
        System.out.println("Original String: " + input); 
        System.out.println("Compressed String: " + output); 
    } 
} 