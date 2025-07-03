package MKT_Java;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		Map<Integer,String> d=new HashMap<Integer,String>();
		for(int i=0;i<6;i++)
		{
		System.out.println("Enter value of integer");
		int h=s.nextInt();
		System.out.println("Enter value of String56");
		String u=s.next();
		d.put(h, u);
		
		}
		System.out.println(d);
		
	}

}
