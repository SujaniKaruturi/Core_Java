package CodePractice;
interface inter1
{
	void nano();
	
}
interface inter2
{
	void sumo();
	
}
public class MultiplelevelInheritanceusingInterface implements inter1,inter2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MultiplelevelInheritanceusingInterface o = new MultiplelevelInheritanceusingInterface();
		o.nano();
		o.sumo();
	}

	@Override
	public void sumo() {
		// TODO Auto-generated method stub
		System.out.println("sumo method from interface inter2 ");
	}

	@Override
	public void nano() {
		// TODO Auto-generated method stub
		System.out.println("nano method from interface inter1 ");
	}

}
