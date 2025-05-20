package assignments_B45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ass_B45_83_List_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  aL=new ArrayList<Integer> ();
		
		aL.add(30);
		aL.add(26);
		aL.add(20);
		aL.add(30);
		aL.add(35);
		aL.add(32);
//		aL.add("Pradnya");
//		aL.add('c');
//		aL.add(null);
//		aL.add(null);
		System.out.println("Follows indexing, null, duplicates"+ aL);
		Collections.sort(aL);
		System.out.println("After Sort"+aL);
		//as sorting can be only done for homogenous data
		//sorting can be done using collections class
		
		
		//yellow line indicates warning. can be eliminated using wrapper class.
		//List<E> interface - has wrapper class so we need to upcast along with parameters of List Interface.
		//so from line 13 as we given correct format,warning disappeared.
		List aL1=new ArrayList(); //here we are passing integer and string as input,so which WrapperClass need to be passed in List Interface?
		aL1.add(40);
		aL1.add("hello");
		aL1.addAll(aL);		//accept entire collection
		System.out.println("addAl " + aL1);
		
		boolean b1=aL.equals(aL1);
		System.out.println("equal or not " + b1);
		
		System.out.println("fetch 2nd data " + aL1.get(2));	//20 is answer as indexing starts from 0.
		System.out.println("replace 1st index with Sujani  " + aL1.set(1,"Sujani"));
		
		System.out.println("IndexOf  " + aL1.indexOf("Sujani"));	//returns index of object
		System.out.println("IndexOf " + aL1.indexOf(35));
		
		
		aL1.remove(6);
		System.out.println("Removed 6th element using index parameter " + aL1);
		//aL1.remove(15);
		//System.out.println("Removed 1th element using index parameter " + aL1);	// java.lang.IndexOutOfBoundsException: Index 15 out of bounds for length 7
		
		
		aL1.remove("Hello");	//Removing using object as argument for method remove.
		System.out.println("Removing Hello element using object paramater" + aL1);	//As Hello and hello is cases sensitive,hello is not removed.
		
		
		aL1.remove("hello");	//Removing using object as argument for method remove.
		System.out.println("Removing hello element using object paramater" + aL1);
		
		
		boolean g=aL1.contains("Hello");
		System.out.println("list contains Hello " + g);  //case-sensitive -so false

		boolean h=aL1.contains("hello");
		System.out.println("list contains Hello " + h);	//true
		
		boolean k=aL1.contains("40");
		System.out.println("list contains 40 " + k);	//as int should not be double quotes-false
		
		boolean o=aL1.contains(40);
		System.out.println("list contains 40 " + o); 	//true
		
		List  L2=new ArrayList();
		L2.add(40);
		L2.add("hello");
		L2.add("Pradnya");
		L2.add('c');
		L2.add(null);
		System.out.println("List is " + L2);
		System.out.println("size of List is " + L2.size());
		
		L2.clear();
		System.out.println("clear list " + L2);
		
		boolean f=L2.isEmpty();
		System.out.println("list is empty or not " + L2);
		
		List  aL2=new ArrayList();
		aL2.add("Ajay");
		aL2.add("Ajuy");
		aL2.add("Ajy");
		aL2.add("Ajry");
		aL2.add("Ajqy");
		aL2.add("Ajky");
		System.out.println("list is" + aL2);
		
		Collections.sort(aL2);
		System.out.println("After Sort"+aL2); 
		//follows alphabetical order of 3rd character as first 2letters are same in all words.
		
		
		Iterator i1= aL.iterator();
		System.out.println("List values after sorting are "+aL); 
		System.out.println("Forword Iteration using iterator");
		while(i1.hasNext())	//checks element is present or not, return type of hasNext is boolean
		{
			System.out.println(i1.next()); 	//fetches element,return type of next is object
		}
		System.out.println("Forword Iteration using listIterator");
		ListIterator i2= aL.listIterator();
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
