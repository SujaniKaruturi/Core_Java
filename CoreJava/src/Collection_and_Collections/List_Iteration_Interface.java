package Collection_and_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iteration_Interface {

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
		i_l1.remove(); 	 //removing last element using iterator
		System.out.println("List after removing element using iterator at last index" + l1);
		
		ListIterator i2_l1 = l1.listIterator();
		i2_l1.next();
		i2_l1.set(5432);  //adding element using listiterator at first index
		System.out.println("List after adding element using listiterator at first index" + l1);
		System.out.println("ListIterator - hasNext");
		while(i2_l1.hasNext())
		{
			System.out.println(i2_l1.next());
			
			
		}
		i2_l1.set(3456);  //adding element using listiterator at last index
		System.out.println("List after adding element using listiterator at last index" + l1);
		i2_l1.remove();  //removing last element using listiterator
		System.out.println("List after removing last element using listiterator" + l1);
		System.out.println("ListIterator - hasPrevious"); 	//backward-Reverse
		while(i2_l1.hasPrevious())
		{
			System.out.println(i2_l1.previous());
		}
		
		// Create an ArrayList
        ArrayList<String> colors = new ArrayList<String>();

        // Adding elements to the arraylist
        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Green");

        ListIterator<String> listIterator
            = colors.listIterator();

        // Print the original ArrayList created
        System.out.println("List Before remove() :- "
                           + colors);

        // we want to remove Blue element from the arraylist
        for (String it : colors) {
            listIterator.next();
            // if we reached to required element break the
            // loop
            if (it == "Blue")
                break;
        }

        // remove color blue from arraylist
        listIterator.remove();

        System.out.println("List After remove():- "
                           + colors);
	}

}
