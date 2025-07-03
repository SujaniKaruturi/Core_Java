package Programming_Questions;

public class Print_Stars {

	public static void star1()
	{
		int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	public static void star2()
	{
		int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	public static void pyramid()
	{
		int n = 5;

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star1();
		star2();
		pyramid();
		
	}

}
