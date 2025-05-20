package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//40. Launch amazon and findout co-ordinates of "About Amazon"
public class S_40_41_Scroll_up_Down_CoOrdinates_Amazon {
	static void coOrdinates()
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement amazon=driver.findElement(By.linkText("About Amazon"));
		Point xandy =amazon.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		System.out.println("x co-ordinates are " +x);
		System.out.println("y co-ordinates are " +y);
		/*
		 * JavascriptExecutor var1 = driver;
		 * var1.executeScript("arguments[0].scrollIntoView();", amazon);
		 */
		
		Actions a=new Actions(driver);
		a.moveToElement(amazon).perform();	
		a.moveByOffset(x,y).click().perform();   //How to take ur mouse to any location and click on it.
		//Exception in thread "main" org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds
	}
	static void scrollUp_Down() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement abtAmzn = driver.findElement(By.xpath("//a[.='About Amazon']"));
		
		Point v1 = abtAmzn.getLocation();
		int x = v1.getX();
		int y = v1.getY();
		System.out.println("X cordinate = "+x);
		System.out.println("Y cordinate = "+y);
		
		Thread.sleep(1000);
		JavascriptExecutor var1 = driver;
		var1.executeScript("window.scrollBy(0,"+y+")");	//Scroll Down
		Thread.sleep(1000);
		var1.executeScript("window.scrollBy(0,-"+y+")");	//Scroll Up
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//coOrdinates();
		scrollUp_Down();
	}

}
