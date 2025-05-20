package assignments_B45;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ass_B45_46_List_Iteration_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		//add(object) so we have freedom to input any data.
		//indexing is allowed,first come first serve.
		l1.add(24);			//int  
		l1.add("Sujani");	//string value
		l1.add(24.456f);	//Double value
		l1.add(null);		//Null value
		l1.add('G');		//Char value
		l1.add(24);			//int  
		l1.add("Sujani");	//string value
		l1.add(24.456f);	//Double value
		l1.add(null);		//Null value
		l1.add('G');		//Char value
		System.out.println("List " + l1);
		
		
		Iterator i_l1 = l1.iterator();
		System.out.println("Iterator");
		while(i_l1.hasNext())
		{
			System.out.println(i_l1.next());
		}
		
		ListIterator i2_l1 = l1.listIterator();
		System.out.println("ListIterator - hasNext");
		while(i2_l1.hasNext())
		{
			System.out.println(i2_l1.next());
		}
		System.out.println("ListIterator - hasPrevious"); 	//backward-Reverse
		while(i2_l1.hasPrevious())
		{
			System.out.println(i2_l1.previous());
		}
	}

}
