package Programming_Questions;

import java.util.Arrays;

public class Array_min_max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,7,89,34,2};
		
        int max=a[0];//1
        int min=a[0];//1
        
        for(int i=0;i<=a.length-1;i++)
        {
     	   if(a[i]>max)//1>1 //3>1//5>3// 6>5//7>6
     	   {
     		   max=a[i];//3// 5 //6 //7
     	   }
     	   if(a[i]<=min) //1<1 
     	   {
     		   min=a[i];
     	   }
        }
	System.out.println("Maximum Value is "+max);
	System.out.println("Minimum value is "+min);
	
	}


	}


