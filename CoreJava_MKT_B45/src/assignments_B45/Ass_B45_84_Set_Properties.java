package assignments_B45;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Ass_B45_84_Set_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> aL=new HashSet<Integer> ();
		//yellow line indicates warning. can be eliminated using wrapper class.
		//Set<E> interface - has wrapper class so we need to upcast along with parameters of Map Interface.
		//so from line 13 as we given correct format,warning disappeared.
				
		Set aL2=new HashSet();
		aL.add(30);
		aL.add(26);
		aL.add(20);
		aL.add(30);
		aL.add(13);
		aL.add(100);
		aL2.add(35);
		aL2.add(32.06);
		aL2.add("World");
		aL2.add('c');
		aL2.add(null);
//		aL.add(null);
		System.out.println("Set doesnt follow indexing, Duplicates not allowed, Single null allowed"+aL); //[32, Pradnya, null, 35, c, 20, 26, 30]
		System.out.println("Set doesnt follow indexing, Duplicates not allowed, Single null allowed"+aL2); 
//		Collections.sort(aL); 
		System.out.println("Sorting not allowed in set");
		
		Iterator i1= aL.iterator();
		System.out.println("Forword Iteration using iterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Iteration Not Possible using listIterator");
		//ListIterator i2= aL.listIterator(); 
	}
	

}
