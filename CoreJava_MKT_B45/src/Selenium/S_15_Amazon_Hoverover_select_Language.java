package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_15_Amazon_Hoverover_select_Language {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement lang=driver.findElement(By.xpath("//div[text()='EN']"));
		Actions a=new Actions(driver);		//hoverover
		a.moveToElement(lang).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='nav-template nav-flyout-content nav-tpl-itemList'])[1]/a[@lang='te-IN']")).click();
	}

}
