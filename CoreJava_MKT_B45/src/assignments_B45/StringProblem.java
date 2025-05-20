package assignments_B45;
//Find out how many are alphabets,numerics,special characters,spaces in  a string?
public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hello! sujani1 @ravi2 &rushika3 ";
		int len=st.length();
		System.out.println("Total String length " + st.length());
		
		char c1[]=st.toCharArray();
		
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			boolean b=Character.isLetter(c1[i]);
			//System.out.println(b);
			if(b==true)
			{
				count++;
			}
		}
		System.out.println("Count of characters in string " + count);
		
		int count1=0;
		for(int i=0;i<st.length();i++)
		{
			boolean b=Character.isDigit(c1[i]);
			//System.out.println(b);
			if(b==true)
			{
				count1++;
			}
		}
		System.out.println("Count of digits in string " + count1);
		
		int count2=0;
		for(int i=0;i<st.length();i++)
		{
			boolean b=Character.isSpaceChar(c1[i]);
			//System.out.println(b);
			if(b==true)
			{
				count2++;
			}
		}
		System.out.println("Count of space in string " + count2);
		
		int specialchar = len-(count + count1+ count2);
		System.out.println("Count of special characters in string " + specialchar);
		

	}

}
