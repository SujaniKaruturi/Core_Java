package Programming_Questions;

public class Missing_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 4, 5, 6};
	        int n = 6; // Maximum number in the sequence
	        // Simple for loop to check missing number
	        for (int i = 1; i <= n; i++) 
	        {
	        	boolean found = false;
	        	// System.out.println("Missing number is: " + i);
	            for (int j = 0; j < arr.length; j++)
	            {
	                if (arr[j] == i) 
	                {
	                	found = true;
	                    break;
	                }
	             }
	            if (!found) 
	            {
	                System.out.println("Missing number is: " + i);
	            }
	        }
	        
	        }
	                
	               
	
	

}
