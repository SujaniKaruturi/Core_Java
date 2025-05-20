package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//4.  WAP launch amazon try to search something using search field using ID Locator
//11. WAP launch amazon try to search something using search field using relative xpath
public class S_4_11_Search_Mobile_Using_IDLocator {

	WebDriver driver;
	public void amazon_Mobile_Search() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile"); //Search mobile in search input
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	}
	public void amazon_Mobile_Search_Using_RelativeXpath() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile"); //Search mobile in search input
		driver.findElement(By.id("//input[@id='nav-search-submit-button']")).click();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		S_4_11_Search_Mobile_Using_IDLocator v=new S_4_11_Search_Mobile_Using_IDLocator();
		//v.amazon_Mobile_Search();
		v.amazon_Mobile_Search_Using_RelativeXpath();
	}

}
