package CodePractice;
//MAp Interface MApping program
import java.util.HashMap;
import java.util.Map;

public class Map_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m1=new HashMap <String,Integer>();	//upcasting HashMap to Map to get the properties of Map
		m1.put("RaviTeja",1);
		m1.put("Sujani",2);
		m1.put("Rushika",3);
		m1.put("Krishna",4);
		System.out.println("Keys   " + m1.keySet());
		System.out.println("Values " + m1.values());
		System.out.println("Key Value Pairs " + m1.entrySet());
	}

}
