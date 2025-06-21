package Programming_Questions;

public class Swap_2_Numbers {
	public static void swap2numbers_without_TempVariable() 
	{ 
		int a=78; 
		int b=45; 
		a=a+b; 
		b=a-b; 
		a=a-b; 
		System.out.println(); 
		System.out.println("Value of a "+ a); 
		System.out.println("Value of b "+ b); 
	} 
	public static void swap2numbers_with_TempVariable() 
	{ 
		int a=76; 
		int b=93; 
		int temp; 
		temp =a; 
		a=b; 
		b=temp; 
		System.out.println(); 
		System.out.println("Value of a "+ a); 
		System.out.println("Value of b "+ b); 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap2numbers_without_TempVariable();
		swap2numbers_with_TempVariable();
	}

}
