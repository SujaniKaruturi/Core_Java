package assignments_B45;

import java.util.Arrays;

//Compare 2 arrays of char and string datatype
public class Ass_B45_25_26_Compare_Arrays {

	static void stringArray()
	{
		String stringArray1[]= new String[4];
		String stringArray2[]= new String[4];
		stringArray1[0] = "Sujani";
		stringArray1[1] = "Karuturi";
		stringArray1[2] = "Ravi";
		stringArray1[3] = "Teja";
		
		stringArray2[0] = "Sujani";
		stringArray2[1] = "Karuturi";
		stringArray2[2] = "Ravi";
		stringArray2[3] = "TEJA"; 	//String is case sensitive, TEJA and teja are different
	
		
		if(Arrays.equals(stringArray1, stringArray2))
		{
			System.out.println(" Both the String Arrays are equal");
		}
		else
		{System.out.println(" Both the String Arrays are not equal");
			
		}
		
	}
	static void charArray()
	{
		char charArray1[]= new char[4];
		char charArray2[]= new char[4];
		charArray1[0]= 'R';
		charArray1[1]= 'A';
		charArray1[2]= 'V';
		charArray1[3]= 'i';
		
		charArray2[0]= 'R';
		charArray2[1]= 'A';
		charArray2[2]= 'V';
		charArray2[3]= 'I';	//i, I are different so char array are nor equal
		if(Arrays.equals(charArray1, charArray2))
		{
			System.out.println(" Both the char Arrays are equal");
		}
		else
		{System.out.println(" Both the char Arrays are not equal");
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringArray();
		charArray();
	}

}
