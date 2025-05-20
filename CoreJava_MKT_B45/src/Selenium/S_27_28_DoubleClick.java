package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//27. Launch google and double click on gmail
//28. Launch google and right click on gmail
public class S_27_28_DoubleClick {
	static void double_right_Click() throws InterruptedException
		{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement double_click = driver.findElement(By.linkText("Gmail"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		//a.doubleClick(double_click).perform();
		a.contextClick(double_click).perform();
		
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		double_right_Click();
	}

}
