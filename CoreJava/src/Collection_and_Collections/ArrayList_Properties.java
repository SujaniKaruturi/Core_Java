package Collection_and_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import com.sun.tools.javac.comp.Check;

public class ArrayList_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Type of ArrayList Constructors
		ArrayList a= new ArrayList();  //arrayList store stores heterogenous values,accepts indexing,first come fist serve
		//initial capacity is 10,Arraylist increases it capacity by 50% of its current capacity, when the current capacity is exceeded. 
		ArrayList b= new ArrayList(8); //capacity of arraylist is fixed intially to 8
		ArrayList c= new ArrayList(a); //a is already created arraylist upon which we need to create one more arraylist.
		ArrayList<Integer>  aL=new ArrayList<Integer> ();	//another way if all elements are integer values using wrapper class 'Integer'
		
		
		//what could be wrapper class for arraylist with heterogenous values? no wrapper class for hetero values
		
		//a[0]= 45; //not acceptable
		a.add("Sujani");
		a.add(23);
		a.add(456.78f);
		a.add(false);
		a.add(345.67893);
		a.add(null);
		a.add(23);
		a.add("Karuturi");
		a.add(null);
		a.add(23);
		a.add(true);
		System.out.println("Get value  at index 5 " + a.get(5));
		System.out.println("set value  at index 7 " + a.set(7, "Mr")); 
		System.out.println("index of value  23 is-refers the first found index " + a.indexOf(23));
		System.out.println("Follows indexing, Accepts multiple null, duplicates  values ,first come first serve "+a);
		
		c.add("Along with arraylist a");
		c.add(40);
		c.addAll(a);
		System.out.println("size of arraylist " +c.size());
		System.out.println("Using collection as constructor joining arraylist a and c "+ c);
		//System.out.println("clear arraylist " + c.clear());
		c.clear();
		
		
		System.out.println("After Clear method Using collection as constructor joining arraylist a and c "+ c);
		//c arraylist is not joining a and c,need to Check.class
		
		ArrayList<Integer>  a2=new ArrayList<Integer> ();	//another way if all elements are integer values
		a2.add(99);
		a2.add(65);
		a2.add(2);
		a2.add(45);
		a.add(null); // y this value is not printing in output array -becoz it is not as integer.
		a2.add(100);
		a2.add(36);
		a2.add(22);
		a2.add(54);
		a2.add(100);
		a.add(null);
		a2.add(77);
		System.out.println("Array List a2 "+ a2);
		System.out.println("Array List values at 5 is "+a2.get(5));   //to read/fetch elements from arraylist
		System.out.println("Array List contains value 54  "+a2.contains(54));
		Collections.sort(a2);		//sorting can only done for homogeneous data.
		//Collections is a class having sort method.
		System.out.println("After Sort "+ a2);
		
		
		for(int i=0; i<a2.size();i++)
		{
			System.out.println("value at index " + i  + " is "+ a2.get(i)  );
		}
		Iterator i1= a2.iterator();
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
