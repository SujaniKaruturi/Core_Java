package CodePractice;

class Teacher
{
	Teacher()
	{
		System.out.println("Teacher constructor");
	}
	
}
class Professor extends Teacher
{
	Professor()
	{
		System.out.println("Professor constructor");
	}
}
public class SuperCallingStatement {

	public static void main(String[] args) 
	{ 
		//any class object can be created even there is no relation between SuperCallingStatement class and Professor class
		new SuperCallingStatement();
		//new Professor();
		new Teacher();
		
	}

}

/* Output:
 1.  when new SuperCallingStatement(); is only called:
 output is nothing ,blank console because no relation between SuperCallingStatement class and Professor class,
  also no constructor is present in SuperCallingStatement class.
 2. when new Professor(); is called : 
 Output of SPC will from be top to bottom instead of bottom to top. 
 Output: 
 Teacher constructor
Professor constructor , as there is extends relation between professor and teacher class 
3. When new Teacher(); is called:
Output: Teacher constructor
 */
