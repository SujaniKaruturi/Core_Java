package CodePractice;
//interview question
public class AssignmentArray {

	public static void main(String[] args) 
	{
		String name[]=new String[4];
		name[0] ="Name";
		name[1] ="Ravi";
		name[2] ="Sujani";
		name[3] ="Rushika";
		
		String age[] = new String[4];
		age[0]="Age";
		age[1]="30";
		age[2]="27";
		age[3]="3";
		
		
		String id[]=new String[4];
		id[0]="id";
		id[1]="345";
		id[2]="678";
		id[3]="987";
		
		int size=name.length;
		System.out.println(size);
		/*
		for(int i=0; i<size ;i++)
		{
			//System.out.println(name[i]+" "+age[i]+" "+id[i]);   //assignment1
			
			System.out.println(name[i]+" ");
			System.out.println(age[i]+" ");
			System.out.println(id[i]+" ");	
		}
		*/
		for(int i=0; i<=3 ;i++)
		{
			System.out.println(name[i]+" ");
			//System.out.println(age[i]+" ");
			//System.out.print(id[i]+" ");
			
			//for(int j=1;j<=1;j++)
			//{
				//System.out.println(name[j]+" ");
				//System.out.println(age[j]+" ");
				//System.out.println(id[j]+" ");	
			//}
			
		}
		System.out.println(" ");
		
		for(int i=0; i<=3 ;i++)
		{
			System.out.println(age[i]+" ");
		}
	}
}
