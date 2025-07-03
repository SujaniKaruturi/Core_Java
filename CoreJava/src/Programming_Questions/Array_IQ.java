package Programming_Questions;

public class Array_IQ {
	//{4, 5, 6, 7, 4, 5, 8, 9, 4, 6, 10} 
	//element 4 is repeated 3 times at positions [0, 4, 8] 
	//element 5 is repeated 2 times at positions [1, 5]
	//element 6 is repeated 2 times at positions [2, 9] write a java program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {4, 5, 6, 7, 4, 5, 8, 9, 4, 6, 10};
		int count =1;
		boolean[] repeated=new boolean[array.length];
		for(int i=0;i<=array.length;i++)
		{
			if(repeated[i])
			{
				continue;
			}
			System.out.print("Element " + array[i] + " found at positions [" + i);
			System.out.println("");
			for(int j=i+1;j<array.length;j++)
			{
			if(array[i]==array[j])
			{
				count++;
				repeated[j] = true;
				System.out.print(", " + j);

			}
				
			}
		}
		System.out.print("] repeated " + count + " times");

	}

}
