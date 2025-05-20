package assignments_B45;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


// Upcasting Vs Downcasting
	 
		// Parent class
		class Parent {
		    String name;
		 
		    // A method which prints the
		    // signature of the parent class
		    void method()
		    {
		        System.out.println("Method from Parent");
		    }
		}
		// Child class
		class Child2 extends Parent {
		    int id;
		 
		    // Overriding the parent method
		    // to print the signature of the
		    // child class
		    @Override void method()
		    {
		        System.out.println("Method from Child");
		    }
		}
public class Ass_B45_40_Upcasting_DownCasting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst = new ArrayList();
		List lst1 = new LinkedList();
		List lst2 = new Vector();
		List lst3 = new Stack();
		
		Set st = new HashSet();
		Set st1 = new LinkedHashSet();
		Set st2 = new TreeSet();
		
		Queue q1 = new LinkedList();
		Queue q2 = new PriorityQueue();
		Queue q3 = new ArrayDeque();
		// Upcasting
        Parent p = new Child2();
        p.name = "GeeksforGeeks";
 
        //Printing the parentclass name
        System.out.println(p.name);
        //parent class method is overridden method hence this will be executed
        p.method();
 
        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error
 
        // Downcasting Explicitly
        Child2 c = (Child2)p;
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
	}

}
