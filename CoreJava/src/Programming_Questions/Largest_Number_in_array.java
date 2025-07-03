package Programming_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Largest_Number_in_array {

	public static void largest_number_inArray()
	{
		int[] arr = {25, 75, 10, 90, 45};
        // Assume first element is the largest
        int largest = arr[0];
        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // update if current element is greater
            }
        }
        System.out.println("The largest number in the array is: " + largest);
        
        int[] arr1 = {25, 34, 10, 60, 45,100};
        // Assume first element is the largest
        int largest1 = arr[0];  
        //without using if condition
        // Use Math.max() to update largest
        for (int i = 1; i < arr1.length; i++) 
        {
            largest1 = Math.max(largest1, arr1[i]);
        }
        System.out.println("The largest number in the array using math.max function is: " + largest1);
        
	}
	
	 public static void secondLargest_number_inArray()
	 { 
		 int[] numbers = {10, 5,
	 20, 8, 15};
	  
	 // Initialize the largest and second largest
		 int largest = 0; 
	 int secondLargest = 0; // need to check with manjunath 
	 for (int num : numbers) {
		 if (num > largest) 
		 { 
			 	secondLargest = largest; 
			 	largest = num;
		} 
		 else if (num >secondLargest && num != largest) 
		 { 
			 secondLargest = num; 
			 } 
		 }
	 
	 if (secondLargest == 0)
	 { 
		 System.out.println("No second largest number found (maybe all values are equal)"); 
	 }
	 else 
	 { 
		 System.out.println("Second largest number is: " + secondLargest);
		 }
	 }
	 
	
	public static void secondLargest_using_Collections()
	{
		Integer[] arr = {10, 45, 67, 12, 99, 67, 99};

        // Convert array to a List
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Remove duplicates
        Set<Integer> set = new HashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);

        // Sort in descending order
        Collections.sort(uniqueList, Collections.reverseOrder());

        if (uniqueList.size() < 2) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + uniqueList.get(1));
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largest_number_inArray();
		secondLargest_number_inArray();
	}

}
