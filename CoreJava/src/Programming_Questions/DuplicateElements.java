package Programming_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10, 20, 30, 10, 20, 30, 40, 50,10,10};
		int duplicate[]= new int[array.length];
		for(int i=0; i<array.length; i++) // 10, 20, 30, 10, 20, 30, 40, 50
		{
			for(int j=i+1; j<array.length; j++) // 20, 30, 10, 20, 30, 40, 50			
				{
				if(array[i]==array[j])
					{
					duplicate[i]=array[j]; how to place all duplicates element in one array
					System.out.println("Duplicate values are: "+array[j]);
					}
				}
			
		}
		System.out.println("Duplicate values are: "+Arrays.toString(duplicate));
	
		Set<Integer> duplicates=new HashSet<>();
		Set<Integer> value2=new HashSet<>() ;
		
		for(int dup:array)
		{
			if(!value2.add(dup))
			{
				//System.out.println("duplicate elemenys are: "+ dup);
				duplicates.add(dup);
			}
			
		}
		System.out.println(duplicates);

	}

}
