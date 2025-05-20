package assignments_B45;

public class Ass_B45_89_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String w=new String("Sujani");	//old string
		System.out.println("String - "+w);
		w.concat("Karuturi");	//new string 
		String h = w.concat("Karuturi");
		System.out.println("String after concat - "+w);  //output is same as string value w
		//Becoz string is immutable -cannot change value of string
		System.out.println("After concat and placing the value in new string - "+h);
		
		
		StringBuffer sb = new StringBuffer("Sujani Raviteja ");
		System.out.println("Original StringBuffer - "+ sb);
		sb.append("Karuturi");
		System.out.println("After Append - "+sb); 
		sb.insert(0, "Mrs. ");
		System.out.println("After Insert - "+sb); 
		sb.replace(3,5, "@@@");   //need to check this functionality indexing
		System.out.println("After replace - "+sb); 
		sb.delete(0, 3);
		System.out.println("After Delete - "+sb); 
		
		System.out.println("Length-"+sb.length()); 
		System.out.println("Char at index 6-"+sb.charAt(6));
		System.out.println("Substring - "+ sb.substring(0, 8)); 
		System.out.println("After Reverse - "+sb.reverse()); 
		System.out.println("String capacity - "+sb.capacity());  
	}

}
