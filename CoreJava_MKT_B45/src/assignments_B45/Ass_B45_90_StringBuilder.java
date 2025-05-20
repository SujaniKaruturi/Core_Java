package assignments_B45;

public class Ass_B45_90_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();	//default capapcity is 16
		StringBuilder sb1 = new StringBuilder("Sujani");
		StringBuilder sb2 = new StringBuilder(10); 	//creating a stirng buffer with capacity 10.
		
		System.out.println("StringBuilder without Param - "+sb);
		System.out.println("StringBuilder with Param - "+sb1); 
		System.out.println("StringBuilder with int Param - "+sb2);
		
		sb1.append(" Karuturi");	//join 2 strings, as string buffer is mutable ,
		//no need to create a new string after joining 2 strings 
		System.out.println("Length of string  - "+ sb1.length()); 
		System.out.println("After Append - "+sb1); 
		System.out.println("After Insert - "+sb1.insert(0, "Mrs. ")); 
		System.out.println("After Delete - "+sb1.delete(0, 5)); 
		System.out.println("After replace - "+sb1.replace(0, 7, "Raviteja ")); 
		System.out.println("After replace - "+sb1.replace(0, 7, "Hi "));	
		//Raviteja gets replaced with Hi, here string length doesn't matter we are just replacing words even they are of diff size
		System.out.println("After Substring - "+sb1.substring(0, 7)); 
		System.out.println("After Substring - "+sb1.substring(7)); 
		System.out.println("CharAt 8th index - "+sb1.charAt(8));
		System.out.println("After Reverse - "+sb1.reverse()); 
		
	}

}
