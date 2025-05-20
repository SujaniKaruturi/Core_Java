package TESTNG_MKT;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S_51_OrderOfAnnotations {
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("bMethod");
	}
	@Test
	public void test1()
	{
		System.out.println("test2");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
}
