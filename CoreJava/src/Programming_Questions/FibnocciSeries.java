package Programming_Questions;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; 
		int b=1; 
		int sum=0; 
		int i=1; 
		System.out.print("Fibnocci series - "); 
		while(i<13)   //or i<6 or any value till which we need 
		{ 
		sum =a+b; 
		System.out.print(a +" "); 
		a=b; 
		b=sum; 
		i++; 
		} 
	}

}
