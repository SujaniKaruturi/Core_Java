package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//6. click on Gift card using linktext locator
//7. WAP launch Amazon.in and click on Customer service with help of  PartialLinkText locator
public class S_6_7_LinkText_PartialLinkText_Locator {

	public void assignment6()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobiles")).sendKeys(Keys.ENTER); //Search giftcard using link
	}
	public void assignment7()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Service")).sendKeys(Keys.ENTER); //Search CustomerService using Partial link text
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S_6_7_LinkText_PartialLinkText_Locator h= new S_6_7_LinkText_PartialLinkText_Locator();
		//h.assignment6();
		h.assignment7();
		
	}

}
