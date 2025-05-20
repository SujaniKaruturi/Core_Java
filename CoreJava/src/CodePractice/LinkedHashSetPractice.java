package CodePractice;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
public static void main(String[] args) {
	LinkedHashSet a1=new LinkedHashSet();	
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
	System.out.println(a1);

	/*
	LinkedHashSet a2=new LinkedHashSet();
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
	*/
	}

}
