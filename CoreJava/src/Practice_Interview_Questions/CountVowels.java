package Practice_Interview_Questions;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "pallavi124";
		String s2 = "";
		int countnum=0;
		
		for(int i=0 ; i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				System.out.println("vowels " +s1.charAt(i) +" at the index " +i);
				countnum++;
			}
		
		}
		
		System.out.println("number of vowels are " +countnum);
	}


	}


