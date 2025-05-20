package CodePractice;
//
public class CodeArrayProgram {

	public static void main(String[] args)
	{
		String name[]=new String[3];
		name[0] ="Ravi";
		name[1] ="Sujani";
		name[2] ="Rushika";
		//name[3] ="Karuturi";//java.lang.ArrayIndexOutOfBoundsException error, as array size is 3 but we are trying to add 4th name.
		
		int age[] = new int[3];
		age[0]=30;
		age[1]=27;
		age[2]=3;
		
		int id[]=new int[3];
		id[0]=345;
		id[1]=678;
		id[2]=987;
		
		int size=name.length;
		System.out.println(size);
		
		for(int i=0; i<size ;i++)
		{
			//System.out.println(name[i]);   //all 3 names will be in 3 different lines
			//System.out.println(age[i]); 
			//System.out.println(id[i]); 
			
			System.out.print(name[i]);    //all 3 names will be in single line.
			System.out.print(" "); 
		}
		try
		{
			name[3] ="Karuturi";
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handle Exception : adding 4th name to fixed array of size 3");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
