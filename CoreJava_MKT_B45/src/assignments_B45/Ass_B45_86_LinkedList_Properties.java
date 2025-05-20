package assignments_B45;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ass_B45_86_LinkedList_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a1=new LinkedList();	
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
		System.out.println("queue follow indexing, Duplicates allowed, Multiple null values allowed" + a1);
	
		
		LinkedList a2=new LinkedList();
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
		
		Iterator<Integer> it_lList = a2.iterator();
		System.out.println("********Iterator hasNext**********");
		while(it_lList.hasNext())
		{
			System.out.println(it_lList.next());
		}
		
		ListIterator<Integer> it_lList1 = a2.listIterator();
		System.out.println("**********ListIterator hasNext**********");
		while(it_lList1.hasNext())
		{
			System.out.println(it_lList1.next());
		}
		System.out.println("**********ListIterator hasPrevious**********");
		while(it_lList1.hasPrevious())
		{
			System.out.println(it_lList1.previous());
		}

	}

}
