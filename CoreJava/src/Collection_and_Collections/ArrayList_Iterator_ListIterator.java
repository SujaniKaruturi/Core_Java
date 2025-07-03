package Collection_and_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Iterator_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add("dd");
		System.out.println("ArrayList a1 is " + al); // Output: [aa, bb]
		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("cc");
		
		al.removeAll(al2);   //common elements between 2 arraylists gets removed
		System.out.println("ArrayList a1 after removing eleemnts is " + al); // Output: [bb]

		ArrayList aL= new ArrayList();
		aL.add("Pradnya");
		aL.add('P');
		aL.add(342);
		aL.add(null);
		
		Iterator aL_I = aL.iterator();
		System.out.println("Iterator");
		while(aL_I.hasNext())
		{
			System.out.println(aL_I.next());
		}
		ListIterator aL_li= aL.listIterator();
		System.out.println("ListIterator - hasNext");
		while(aL_li.hasNext())
		{
			System.out.println(aL_li.next());
		}
		System.out.println("ListIterator - hasPrevious"); 	//backward-Reverse

		while(aL_li.hasPrevious())
		{
			System.out.println(aL_li.previous());
		}
		
	}

}
