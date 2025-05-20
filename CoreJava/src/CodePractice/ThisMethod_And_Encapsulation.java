package CodePractice;
//Encapsulation using getter and setter methods
class Customer_Data
{
	private String username ="mktmanish@gmail.com";  //restrict the access directly
	private String password = "pasword@123";
	public String get_password()
	{
		return password;
	}
	public void set_password(String password)
	{
		this.password= password;
	}
	public String get_username()
	{
		return username;
	}
	public void set_username(String username)
	{
		this.username=username;    //sujani@gamil.com is value of set method username(local variable) which will be assigned to global variable username.
		//left username is global variable ,right username is set method username(local variable)
	}
	
}
public class ThisMethod_And_Encapsulation {

	public static void main(String[] args) 
	{
		Customer_Data d=new Customer_Data();
		d.set_username("sujani@gamil.com");  //passing sujani@gamil.com to set method username(local variable)   
		System.out.println(d.get_username());
		d.set_password("junior");
		System.out.println(d.get_password()); //passing junior to set method password(local variable)  

	}

}
