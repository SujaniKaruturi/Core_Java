package CodePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_ListofIterator {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(90);
		
		Iterator i=a.iterator();
		System.out.println("Iterator ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		ListIterator li=a.listIterator();
		System.out.println("List Iterator -Forward iteration");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("List Iterator -Backward iteration");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

	}

}
