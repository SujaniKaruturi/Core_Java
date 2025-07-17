package Programming_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Arrays_Practice {

	public static void Arraymin_max()
	{
		int a[]= {1,7,89,34,2}; 
        int max=a[0]; 
        int min=a[0]; 

        for(int i=0;i<=a.length-1;i++) 
        { 
        	if(a[i]>max)
        	{ 
        		max=a[i];
        	} 

        	if(a[i]<=min) 

        	{ 
        		min=a[i]; 
        	} 
        } 

        System.out.println("Maximum Value is "+max); 
        System.out.println("Minimum value is "+min); 
	}
	public static void arrayAverage()
	{
		int a[]= {5,10,15,20,25}; 
		int l=a.length; 
		int sum=0; 
		System.out.println("Length " + l); 
		for(int i=0;i<l;i++) 
		{ 
			sum=sum+a[i]; 
		//System.out.println("sum " + sum); 
		} 
		System.out.println("sum " + sum); 
		int average=sum/l; 
		System.out.println("average " + average); 
	}
	public static void duplicateElementsInArray()
	{
		int array[]= {10, 20, 30, 10, 20, 30, 40, 50,10,10}; 
		Set<Integer> dup = new HashSet<Integer>();
		Set<Integer> nondup = new HashSet<Integer>();
		for(int e:array)
		{
			if(!nondup.add(e))
			{
				dup.add(e);
			}
		}
		System.out.println("duplicates array " + dup); 
		System.out.println("non duplicates array " + nondup); 
		
	}
	public static void mergeArrays()
	{
		int a[]= {6,7,8}; 
		int b[]= {1,2,3,4};
		int merge[]=new int[a.length+b.length];//new array 
		for(int i=0;i<a.length;i++)// loop to store array a elements into merge array 
		{ 
		merge[i]=a[i];// all elements of a[i] assigned to merge
		}
		for(int j=0;j<b.length;j++)// loop to concatinate array b elements to merge array 
		{ 
		merge[a.length+j]=b[j];// all elemnts of b[i] assigned to merge 
		}
		System.out.println(Arrays.toString(merge)); 
	}
	public static void copy_reverse_Array()
	{
		int arr[] = {2,4,6,8,10}; 
		int copy[]=new int[arr.length];
		int reverse[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
		}
		System.out.println(Arrays.toString(copy));
		for(int i=0,j=arr.length-1; i<arr.length && j>=0 ;i++ , j--)
		{
			reverse[j]=arr[i];
		}
		System.out.println(Arrays.toString(reverse));
		
	}
	public static void repeated_Numbers_In_Array()
	{
		int arr[]= {4, 5, 6, 7, 4, 5, 8, 9, 4, 6, 10}; 
	
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Repeated numbers with their counts:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
	}
	public static void missing_Number_InArray()
	{
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraymin_max();
		arrayAverage();
		duplicateElementsInArray();
		mergeArrays();
		copy_reverse_Array();
		repeated_Numbers_In_Array();
		missing_Number_InArray();
	}

}
