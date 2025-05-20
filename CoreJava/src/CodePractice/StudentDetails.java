package CodePractice;

public class StudentDetails 
{
	int marks;
	String name;
	int age;
	
	void sujanidetails(int marks,String name,int age)
	{
		this.marks = marks;    //this.marks is global variable default value is 0 , marks value is 98 from input sujanidetails method
		//this.0 = 98; updating 98 value to this.marks i.e from this.marks = 0 to this.marks = 98						
		//this.name = name;
		//this.age = age;
		
		System.out.println("sujani details");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentDetails j = new StudentDetails();
		j.sujanidetails(98, "Ravi", 31);
		System.out.println(j.marks);   //global variable so output will be default values of variable
		System.out.println(j.name);
		System.out.println(j.age);
	}

}

/* 
StudentDetails j = new StudentDetails();
j.sujanidetails(98, "Ravi", 31);
System.out.println(j.marks);   //global variable so output will be default values of variable
System.out.println(j.name);
System.out.println(j.age);
without this statement in sujanidetails method
output is: 
sujani details
0
null
0


when we enter 
this.marks = marks; 
this.name = name;
this.age = age;
then output is:
sujani details
98
Ravi
31
 * 
 * 
 */
