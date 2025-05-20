package assignments_B45;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;
//watch video of this topic from batch 45
public class Ass_b45_81_Stack_Vector_Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		s1.add("Pradnya");
		s1.add('C');
		s1.add(3528);
		s1.add(null);
		System.out.println("Stack Elements " + s1);
		
		Enumeration e1 = s1.elements();
		System.out.println("Stack Enumeration " +e1);
		while(e1.hasMoreElements())	//return type is boolean
		{
			System.out.println(e1.nextElement());	//return type is object
		}
		
		
		Vector s2 = new Vector();
		s2.add("Teja");
		s2.add('f');
		s2.add(879);
		s2.add(null);
		
		Enumeration e2 = s2.elements();
		System.out.println("Vector Enumeration");
		while(e2.hasMoreElements())
		{
			System.out.println(e2.nextElement());
		}
	}

}
