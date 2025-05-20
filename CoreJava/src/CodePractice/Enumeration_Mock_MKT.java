package CodePractice;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Mock_MKT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("Sujani");
		v.add(89);
		v.add(78.76);
		v.add(" ");
		
		Enumeration r= v.elements();
		while(r.hasMoreElements())
		{
			System.out.println(r.nextElement());
		}
		
	}

}
