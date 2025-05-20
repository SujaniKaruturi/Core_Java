package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//1. Launch empty browsers
//2. Open Google and type india
//3. Login Amazon,Facebook,Flipkart by providing email and pwd then click login 
//10. Login to Amazon with xpath
public class Selenium_1_2_3_10_Assigments{

	static void assignment_1()
	{
		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver1 = new EdgeDriver();
	}
	static void assignment_2()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("india");
	}
	static void amazon_Login() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcart%2Fview.html%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email")).sendKeys("9494913532");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Tejasrii722");
		driver.findElement(By.id("signInSubmit")).click();
		
		//Thread.sleep(5000);
		//driver.quit();
	}
	public void amazon_Login_xpath() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcart%2Fview.html%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9494913532");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Tejasrii722");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		//Thread.sleep(5000);
		//driver.quit();
	}
	static void flipkart_Login() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email")).sendKeys("9494913532");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Tejasrii722");
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
	static void facebook_Login() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sujaninalla11@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Raviteja@3");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(10000);
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//assignment_1();
		//assignment_2();
		//amazon_Login();
		//facebook_Login();
		//not able to login to flipkat,as it asking OTP
		Selenium_1_2_3_10_Assigments p= new Selenium_1_2_3_10_Assigments();
		p.amazon_Login_xpath();
	}

}
