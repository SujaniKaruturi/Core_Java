package Collection_and_Collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorPractice {
	public static void main(String[] args) {
		Vector a1=new Vector();	
		//a1 is heterogenous,accepts indexing,first come fist serve
		a1.add("Sujani");
		a1.add("Ravi");
		a1.add("Rushika");	//String value
		a1.add(345);   		//int value
		a1.add(true);		//boolean value
		a1.add(null);		//accepts null value
		a1.add(null);
		a1.add("Sujani");	//accepts duplicate values
		a1.add("Sujani");
		a1.add(false);
		a1.add(21.0);		//accepts dynamic as well
		System.out.println(a1);
	
		
		Vector a2=new Vector();
		a2.add(99);
		a2.add(65);
		a2.add(2);
		a2.add(45);
		a2.add(100);
		a2.add(36);
		a2.add(22);
		a2.add(54);
		a2.add(77);
		System.out.println(a2);
		Collections.sort(a2);		
		//sorting can only done for homogeneous data.
		//Collections is a class having sort method.
		System.out.println(a2);
		
		Enumeration e= a2.elements();
		while(e.hasMoreElements()==true)
		{
			System.out.println(e.nextElement());
		}

	}

}
