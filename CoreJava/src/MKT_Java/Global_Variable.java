package MKT_Java;

public class Global_Variable {
	static int s=34;
	
		   private static void mulmethod()
		    {
		    	s=13;
		    	System.out.println(s);
		    }
		    void div()
		    {
		    	s=23;
		    	System.out.println(s);
		    }
			public static void main(String[] args) {
				for (int i = 1; i <= 5; i++) {
					for (int j = 1; j <= 5 - i + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
			
			}
				int n = 5;

				for (int i = 0; i <= n; i++) {

					for (int j = i; j < n; j++) {
						System.out.print(" ");
					}
					for (int k = 0; k < 2 * i - 1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				String a[]= {"Ram","Vishnu","Bhim"};
				int index=0;
				for(String b:a)   //for each loop
				{  if(b.equals("Vishnu"))
					System.out.println(index+" "+b);
					index++;
				}
				
				
			}
}


