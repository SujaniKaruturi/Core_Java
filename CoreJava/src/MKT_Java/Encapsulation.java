package MKT_Java;

public class Encapsulation {

	private int OTP = 3132;
	private String name = "Sujani";
	
	public int getOTP() 
	{
		return OTP;
	}

	public void setOTP(int OTP) 
	{
		this.OTP = OTP;
	}

	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public static void main(String[] args) 
	{
		Encapsulation obj = new Encapsulation();
		obj.setOTP(9999);
		obj.setName("Rushika");
		System.out.println(obj.getOTP());
		System.out.println(obj.getName());

	}


}
