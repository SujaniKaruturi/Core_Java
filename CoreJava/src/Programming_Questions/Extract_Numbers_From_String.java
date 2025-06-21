package Programming_Questions;

public class Extract_Numbers_From_String {

	public static void String_contains_OnlyDigits()
	{
		 	String s = "12345"; 
	        boolean isDigitOnly = s.matches("\\d+");  // \\d checks string contains only digits 0-9
	        //returns true or false only
	        System.out.println(isDigitOnly ? "Only digits" : "Contains non-digits"); 
	        String s2 = "adc12345"; 
	        boolean isDigitOnly2 = s2.matches("\\d+");  // \\d checks string contains only digits 0-9
	        //returns true or false only
	        System.out.println(isDigitOnly2 ? "Only digits" : "Contains non-digits"); 
	}
	public static void extract_digits()
	{
		String input = "Pran123789test";
        // Replace all non-digit characters with an empty string
        String digitsOnly = input.replaceAll("\\d", "");
        System.out.println("Extracted digits: " + digitsOnly);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_contains_OnlyDigits();
		extract_digits();
	}

}
