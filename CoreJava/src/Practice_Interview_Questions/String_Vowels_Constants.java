package Practice_Interview_Questions;

public class String_Vowels_Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = "Automation Testing";

    // Convert to lowercase to handle both uppercase and lowercase letters
    s = s.toLowerCase();

    // Remove spaces
    s = s.replaceAll(" ", "");

    int vowels = 0;
    int consonants = 0;

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
}

}
