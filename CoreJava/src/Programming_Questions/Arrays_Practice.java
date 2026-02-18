package Programming_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Arrays_Practice {
//multiply table without using multiply operator
	public static void Multiply_table(int i,int j)
	{
		int k=1;
		int sum=0;
		//5*10=50, so now i has to sum j times to get result
		while(k<=j)
		{
			k++;
			sum = sum +i; 
		}
		 System.out.println("Multiply value is "+sum); 
	}
	//Max diff between any adjacent index in array
	public static void max_adjacent_index()
	{
		int a[]= {2,4,5,8,4,9};
		int mindiff=0;
		int diff=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			diff = a[i+1] - a[i];
			if(diff<mindiff)
			{
				diff= -diff;  //convert to positive if negative
			}
			if(diff>mindiff)
			{
				mindiff=diff;
			}
		}
		System.out.println("adjacent diff value is "+mindiff); 
	}
	public static void compareSameIndexes()
	{
		//compare same indexes of 2 diff array and create another array for matching values
		int d[]= {2,4,7,3,9};
		int h[]= {6,4,9,3,2};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<d.length;i++)
		{
			if(d[i] == h[i])
			{
				al.add(d[i]);
			}
		}
		//converting arraylist to array
		Object[] array=al.toArray();
		//System.out.println("Array with same values at same index is "+array); 
		System.out.println("Array with same values at same index is "+ Arrays.toString(array)); 
		for(Object ob:array)
		{
			System.out.println("Array with same values at same index is "+ob); 
		}
	}
	
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
	public static void array_Sum_Average()
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
		compareSameIndexes();
		max_adjacent_index();
		Multiply_table(5,5);
		 Arraymin_max(); 
		 array_Sum_Average(); 
		 duplicateElementsInArray(); 
		 mergeArrays();
		 copy_reverse_Array(); 
		 repeated_Numbers_In_Array(); 
		 missing_Number_InArray();
		 
	}

}
