package assignments_B45;
//In given String find how many are alphabets, special character,numeric,Spaces
public class Ass_B45_36_String_Count_Space_alpha_speChar_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " I love $ my @ country 1234 time";
		int sLength= s.length();
		int cnt_alphabets = 0;
		int cnt_whtSpaces = 0;
		int cnt_num = 0;
		char array_str[] = s.toCharArray();
		for(int i =0; i<array_str.length;i++)
		{
			if(Character.isAlphabetic(array_str[i]))
			{
				cnt_alphabets++;
			}
			if(Character.isWhitespace(array_str[i]))
			{
				cnt_whtSpaces++;
			}
			if(Character.isDigit(array_str[i]))
			{
				cnt_num++;
			}
			
		}
		int cnt_speChar = sLength - (cnt_alphabets+cnt_whtSpaces+cnt_num);
		System.out.println("Given String is - "+s);    
		System.out.println("Alphabates in String is - "+cnt_alphabets);    	
		System.out.println("Spaces in String is - "+cnt_whtSpaces);			
		System.out.println("Numerics in String is - "+cnt_num);				
		System.out.println("Special Char in String is - "+cnt_speChar);
	}
}
