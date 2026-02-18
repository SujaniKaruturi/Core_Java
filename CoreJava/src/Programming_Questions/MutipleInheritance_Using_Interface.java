package Programming_Questions;

interface Multi1
{
	abstract void book();
}
interface Multi2 extends Multi1
{
	abstract void pen();
}
public class MutipleInheritance_Using_Interface implements Multi2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MutipleInheritance_Using_Interface obj = new MutipleInheritance_Using_Interface();
	        obj.book();  
	        obj.pen(); 
	}

	@Override
	public void book() {
		// TODO Auto-generated method stub
		System.out.println("Book method");	
		}

	@Override
	public void pen() {
		// TODO Auto-generated method stub
		System.out.println("pen method");	
	}

}
