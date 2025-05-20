package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//32.Launch naukri.com and click on google and move control to child window
public class S_32_Naukri_Website {

	static void naukri() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
		
		Set<String> parentandchild = driver.getWindowHandles();   // Set<String> ,set is interface. It will accept all string values inside particular Set
		System.out.println("getWindowHandles " +parentandchild);
		
		driver.close();    //Here the sign in browser will not get closed as control is in parent browser. so we need to move control from parent to child browser.
		//close(): which browser is having control that browser gets closed.Here it is parent.
		
		Iterator<String> i=parentandchild.iterator(); //Iterator() is method to get parent and child id separately. Return type is String.(Iterator is Interface in collections )
				String parentid1 = i.next();		//first next method of iterator of string will always gives parent id.
				String Childid1 =  i.next();		//second next method of iterator of string will always gives child id.
				System.out.println(parentid1);
				System.out.println(Childid1);
				
		driver.switchTo().window(Childid1);	//want to move control from parent to child to login by entering details.
		
		driver.findElement(By.id("identifierId")).sendKeys("sujaninalla1@gmail.com");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		naukri();
	}

}
