package TESTNG_MKT;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class S_45_OrderofAnnotation {
	@Test
	public void testCase1()
	{
		System.out.println("TestCase1");
	}
	
	@AfterMethod
	public void aMethod()
	{
		System.out.println("aMethod");
	}
	
	@AfterClass
	public void aClass()
	{
		System.out.println("aClass");
	}
	
}
