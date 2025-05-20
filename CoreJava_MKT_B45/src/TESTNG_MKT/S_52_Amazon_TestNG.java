package TESTNG_MKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//WAP which is having @before and after methods should perform below steps:
//1.launch browser
//2.Login to amazon and search for any product
//3. Login to amazon and add product to wishlist
//4.close browser
public class S_52_Amazon_TestNG {

	WebDriver driver;
	@BeforeMethod
	public void launch_Amazon()
	{
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcart%2Fview.html%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	}
	@Test
	public void login_SearchProduct() throws InterruptedException
	{
		System.out.println("Login and Search Product");
		Thread.sleep(10000);
		driver.findElement(By.id("ap_email")).sendKeys("9494913532");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Tejasrii722");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile"); //Search mobile in search input
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Test
	public void login_AddToWishlist() throws InterruptedException
	{
		System.out.println("Login and Wishlist Product");
		Thread.sleep(10000);
		driver.findElement(By.id("ap_email")).sendKeys("9494913532");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Tejasrii722");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile"); //Search mobile in search input
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();
		driver.findElement(By.name("submit.add-to-registry.wishlist")).click();
	}
	@AfterMethod
	public void Close_Amazon()
	{
		//driver.close();
		driver.quit();
	}
}
