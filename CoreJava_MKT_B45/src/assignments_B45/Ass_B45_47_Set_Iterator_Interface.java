package assignments_B45;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ass_B45_47_Set_Iterator_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1 = new HashSet();
		s1.add("Asha");
		s1.add(123);
		s1.add('c');
		s1.add(null);
		
		Iterator i_s1 = s1.iterator();
		System.out.println("Set Iterator");
		while(i_s1.hasNext())
		{
			System.out.println(i_s1.next());
		}
	}

}
