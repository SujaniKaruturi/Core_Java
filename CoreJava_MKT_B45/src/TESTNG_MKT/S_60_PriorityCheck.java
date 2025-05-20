package TESTNG_MKT;

import org.testng.annotations.Test;
//-1 has highest priority then 0,1,2,3 etc
public class S_60_PriorityCheck {

	@Test(priority=0)
	public void testcaseC()
	{
		System.out.println("testcaseC");
	}
	@Test(priority=-1)
	public void testcaseA()
	{
		System.out.println("testcaseA");
	}
	@Test(priority=1)
	public void testcaseB()
	{
		System.out.println("testcaseB priority =1");
	}
	@Test(priority=1)
	public void testcaseD()
	{
		System.out.println("testcaseD priority =1");
	}
}

