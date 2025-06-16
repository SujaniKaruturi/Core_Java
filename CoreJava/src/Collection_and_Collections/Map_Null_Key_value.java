package Collection_and_Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map_Null_Key_value {
 
	
	public static void main(String[] args) {
		
		//HashMap: Allows one null key and multiple null values.
		Map<String, String> map = new HashMap<>();

        map.put(null, "Value for null key");
        map.put("One", "First Value");
        map.put("Two", null);  // null value is also allowed

        System.out.println("Value for null key: " + map.get(null));
        System.out.println("Value for 'Two': " + map.get("Two"));
        
        //Hashtable: Does NOT allow null keys or null values.
        Hashtable<String, String> table = new Hashtable<>();
        table.put(null, "Some Value"); // Throws NullPointerException
	}

}
