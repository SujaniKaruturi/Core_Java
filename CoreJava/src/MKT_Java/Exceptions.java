package MKT_Java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exceptions {

	public static void InputMisMatchException()
	{
		System.out.println("Enter byte value as 32000 and check exception");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary ");  //-128 to 127 is byte range,so java.util.InputMismatchException is seen
		byte salary=s.nextByte();
		System.out.println("Salary is " +salary);
	}
	public static void StringIndexOutOfBoundException()
	{
		String s="Hello";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(10));
		}
	}
	
	public static void ArrayIndexOutOfBoundsException()
	{
		/*
		Array f[]=new Array[3];   
		f[0] = "Come";  //not recommended creation of array ,it should be datatype specific
		
		Array g[] = {12,45,67,89,34,65};
		*/
		
		int a[]=new int[5];  //as index starts from 0 to 4
		int b[]= {20,30, 40,50,20,30,60,30,80,20};
		String s[] = {"hi"," " ,null,  "Hello" , "hi" , "Welcome" , null, "hi"};
		//Accepts any no:of duplicate and null values
		System.out.println("String Array is" + Arrays.toString(s));
		System.out.println("String Array is" + Arrays.toString(b));
		a[0] = 15;
		a[1] = 25;
		a[2] = 35;
		a[3] = 55;
		a[4] = 65;
		
		a[5] = 45;    //ArrayIndexOutOfBoundsException
		
		System.out.println("Length of String d "+ s.length);
	}
	public static void NullPointerException()
	{
		String s= "";
		String d=null;
		
		System.out.println("Length of String s "+ s.length());
		System.out.println("Length of String d "+ d.length());
		
		// Checking if s.equals null
        try
        {
            // This line of code throws NullPointerException
            // because s is null
            if (d.equals("gfg"))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
	}
	public static void IllegalArgumentException()
	{
		String s = "";
	      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }

        // String s set to a value
        // and calling getLength()
        s = "GeeksforGeeks";
      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }

        // Setting s as null and
        // calling getLength()
        s = null;
      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }
    }

    // Function to return length of string s. It throws
    // IllegalArgumentException if s is null.
    public static int getLength(String s)
    {
        if (s == null)
            throw new IllegalArgumentException(
                "The argument cannot be null");
      
        return s.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputMisMatchException();
		ArrayIndexOutOfBoundsException();
		//StringIndexOutOfBoundException();
		//NullPointerException();
		//IllegalArgumentException();
	}

}
