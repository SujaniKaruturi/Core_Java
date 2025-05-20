package assignments_B45;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ass_B45_85_Queue_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1 = new LinkedList();
		q1.add(123);
		q1.add(124);
		q1.add(123);
		q1.add(12);
		q1.add(200);
		q1.add(10);
		q1.add(123);
		
		q1.add("pradnya");
		q1.add("pradnya");
		q1.add(null);
		q1.add(true);
		q1.add(123);
		q1.add(null);
		System.out.println("queue follow indexing, Duplicates allowed, Multiple null values allowed" + q1);
		
//		Collections.sort(q1);   // Sort is Not applicable for queue
		
		Iterator qI = q1.iterator();
		while(qI.hasNext())
		{
			System.out.println(qI.next());
		}

//		ListIterator qIL = q1.listIterator();// listIterator is Not applicable for queue
		

	}

}
