package assignments_B45;
//WAP on updating the value of variable
public class Ass_11_local_Variable {

	public void add()
	{
		int c= 350;
		System.out.println("value of c "+c);
		c=500;
		System.out.println("value of c after updation  "+c);
	}
	public static void main(String[] args) {
		
		Ass_11_local_Variable j =new Ass_11_local_Variable();
		j.add();
	}

}
