package assignments_B45;

public class Ass_B45_23_Area_of_Circle_math_random {

	public void areaOfCircle()
	{
		// math.PI method comes from math class, math class comes from java.lang package
		double pi =Math.PI;
		System.out.println("Value of PI is " + pi);
		// Random method comes from math class, math class comes from java.lang package
		double r= Math.random();
		double circleArea = pi*r*r;
		System.out.println("Area of circle " + circleArea);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass_B45_23_Area_of_Circle_math_random g =new Ass_B45_23_Area_of_Circle_math_random();
		g.areaOfCircle();
		System.out.println("Radius of circle for 10 times ");
		double pi = Math.PI;
		//double r = Math.random(); // Random method comes from math class, math class comes from java.lang package
		for(int i = 0; i<10;i++)
		{
			double r = Math.random();
			System.out.println("Radius of circle is "+i + " -> "+r);
			double circleArea = pi*r*r;
			System.out.println("Area of circle "+i + " -> "+circleArea);
		}
	}

}
