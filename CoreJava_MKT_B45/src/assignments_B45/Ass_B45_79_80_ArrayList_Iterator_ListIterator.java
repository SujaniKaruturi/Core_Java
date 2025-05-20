package assignments_B45;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ass_B45_79_80_ArrayList_Iterator_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
