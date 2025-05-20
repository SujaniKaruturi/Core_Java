package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_5_42_YouTube_Search_Grotechminds_InfiniteTimes_ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("GroTechMinds");
		//driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).sendKeys(Keys.ENTER);
		
		JavascriptExecutor j=driver;
		for(int i=1;i>0;i++) 
		{
			j.executeScript("window.scrollBy(0,1000)");	//scroll down by y-axis for every 1000
			Thread.sleep(2000);
			System.out.println(i);
		}
		
		
		
	}

}
