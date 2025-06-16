package Practice_Interview_Questions;

public class Fibnocci_series {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			int a=0;
			int b=1;
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i=1;i<=10;i++)
			{
				int sum=a+b;// sum= 0+1=1  //1+1=2
				a=b;//a becomes 1
				b=sum;// b is 1
				System.out.print(sum+" ");
			}

		}

	

}
