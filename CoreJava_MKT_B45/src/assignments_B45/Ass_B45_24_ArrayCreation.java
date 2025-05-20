package assignments_B45;

import java.util.Arrays;

//To create boolean,double,char datatype Array
public class Ass_B45_24_ArrayCreation {

	
	static void Array_Bool()
	{
		//Boolean datatype Array
				boolean boolArray[] = new boolean[2];
				boolArray[0] = false;
				boolArray[1] = true;
				System.out.println("Boolean Array");
				for(int i = 0; i<2;i++)
				{
					System.out.println(boolArray[i]);
				}
	}
	static void Array_double()
	{
				// double datatype Array 
				double dblArray[] = new double[3];
				dblArray[0] = 34.12133;
				dblArray[1] = 0.246;
				dblArray[2] = 2434.133;
				System.out.println("Double datatype Array");
				for(int i = 0; i<3; i++)
				{
					System.out.println(dblArray[i]);
				}
	}
	static void Array_char()
	{
				// char datatype Array 
				char chrArray[] = new char[4];
				chrArray[0] = 'a';
				chrArray[1] = 'b';
				chrArray[2] = 'c';
				chrArray[3] = 'd';
				// chrArray[4] = 'e';   ------   ArrayIndexOutOfBoundsException:
				System.out.println("Char Datatype Array");
				System.out.println("Char Datatype Array " +chrArray ); //prints some random chunk value
				System.out.println("Char Datatype Array "+Arrays.toString(chrArray));
				for(int i = 0; i<4; i++)
				{
					System.out.println(chrArray[i]);
				}
	}

	public static void main(String[] args)
	{
		Array_Bool();
		Array_double();
		Array_char();		
	}

}
