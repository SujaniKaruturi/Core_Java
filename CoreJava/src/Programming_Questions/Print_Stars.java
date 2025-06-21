package Programming_Questions;

public class Print_Stars {

	public static void star1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" +" ");
			}
			System.out.println(" ");
		}
	}
	public static void star2()
	{
		System.out.println(" ");
		for(int i=1;i<=4;i++)
		{
			for(int j=5-i;j>0;j--)
			{
				System.out.print("*" +" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star1();
		star2();
	}

}
