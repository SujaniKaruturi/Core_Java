package assignments_B45;
//88. Map Iterator -Iteration
//87. Map Iterator -For Each Loop
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ass_B45_87_88_Map_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m1=new HashMap <String,Integer>();	//upcasting HashMap to Map to get the properties of Map
		Map<String,String> m2=new HashMap <String,String>();
		Map<String,Character> m3=new HashMap <String,Character>();
		
		m1.put("RaviTeja",1);  
		m1.put("Sujani",2);
		m1.put("Rushika",3);
		m1.put("Krishna",4);
		//m1.put(4, "Hello");	//put<String,Integer> only so this input is not accepted
		System.out.println("Keys value pairs m1 " + m1);
		System.out.println("Keys   " + m1.keySet());
		System.out.println("Values " + m1.values());
		System.out.println("Key Value Pairs " + m1.entrySet());
		Map<String,Integer> m4=new HashMap <String,Integer>();
		m4.put("Ravi",1);  
		m4.put("Sujani",2);
		m4.put("Rushika",3);
		m4.put("Krishna",4);
		System.out.println("Keys value pairs m4 " + m4);
		
		Map<String,Integer> m5=new HashMap <String,Integer>();
		m5.put("RaviTeja",1);  
		m5.put("Sujani",2);
		m5.put("Rushika",3);
		m5.put("Krishna",4);
		
		boolean b =m4.equals(m5);
		System.out.println("m4 equals to m5 " + b);
		
		boolean u =m1.equals(m5);
		System.out.println("m1 equals to m5 " + u);
		
		m1.putAll(m4); 	//AddAll of list interface,but need to store in new map but cannot 
		System.out.println("m1,m4 Keys value pairs " + m1);  //will not allow duplicate elements
		
		m1.clear();
		System.out.println("Clearing m1 map " + m1);
		System.out.println(m1.isEmpty());
		
		m1.putIfAbsent("Fish",6);	//add if its not present.
		System.out.println("Adding one more record to  m1 map " + m1);
		

		boolean o =m4.containsKey("Ravi");
			boolean j=m4.containsValue("1");
		System.out.println("Contains Key value 1 " + j);
		System.out.println("Contains Key Ravi " + o);   //output hould be true but getting false check again
		boolean k =m4.containsKey("Hello");
			boolean i=m4.containsValue("7");
		System.out.println("Contains Key value 7 " + k);
		System.out.println("Contains Key  Hello " + i);
		
		System.out.println("Map Iterator -Iteration");
		Set<Entry<String, Integer>> s1 = m1.entrySet();
		Iterator<Entry<String, Integer>> i_s1 = s1.iterator();
		while(i_s1.hasNext())
		{
			System.out.println(i_s1.next());
		}
		
		System.out.println("Map Iterator -For Each Loop");
		System.out.println("-------Map keys Iteration using keySet------");
		for(String i1:m5.keySet())	//return type is set of String
		{
			System.out.println(i1);
		}
		System.out.println("-------Map values Iteration using values------");
		for(Integer s2:m5.values())	//return type is collection of Integer
		{
			System.out.println(s2);
		}
		System.out.println("-------Map Iteration using entrySet------");
		for(Entry<String, Integer> e1:m5.entrySet())
		{
			System.out.println(e1);
		}
	}

}
