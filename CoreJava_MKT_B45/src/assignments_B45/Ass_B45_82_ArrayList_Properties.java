package assignments_B45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Ass_B45_82_ArrayList_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();  //what could be wrapper class for arraylist with heterogenous values
		
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
		System.out.println("Follows indexing, null, duplicates "+a1);
		
		ArrayList a2=new ArrayList(a1);
		ArrayList<Integer>  aL=new ArrayList<Integer> ();	//another way if all elements are integer values
		a2.add(99);
		a2.add(65);
		a2.add(2);
		a2.add(45);
		a2.add(100);
		a2.add(36);
		a2.add(22);
		a2.add(54);
		a2.add(77);
		System.out.println("Array List a2 along with a1 using ArrayLis(Collection) constructor"+ a2);
		//Collections.sort(a2);		
		//sorting can only done for homogeneous data.
		//Collections is a class having sort method.
		//System.out.println("After Sort "+ a2);
		Iterator i1= a1.iterator();
		System.out.println("Forword Iteration using iterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Forword Iteration using listIterator");
		ListIterator i2= a2.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Reversse Iteration using listIterator");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}

}
