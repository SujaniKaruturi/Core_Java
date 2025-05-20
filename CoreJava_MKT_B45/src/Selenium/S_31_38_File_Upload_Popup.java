package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//31.File upload popup using grotechminds registration page
import org.openqa.selenium.support.ui.Select;

public class S_31_38_File_Upload_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		driver.findElement(By.id("fname")).sendKeys("Sujani");
		driver.findElement(By.id("lname")).sendKeys("Karuturi");
		driver.findElement(By.id("email")).sendKeys("sujaninalla1@gmial.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("Female")).click();
		WebElement skills= driver.findElement(By.id("Skills"));
		Select s=new Select(skills);		//Dropdown
		s.selectByIndex(2);
		WebElement country= driver.findElement(By.id("Country"));
		Select s1=new Select(country);
		s1.selectByValue("India");
		driver.findElement(By.id("Present-Address")).sendKeys("Ameenpur");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Tadiparru");
		driver.findElement(By.id("Pincode")).sendKeys("534217");
		WebElement religion= driver.findElement(By.id("Relegion"));
		Select s2=new Select(religion);
		s2.selectByVisibleText("Hindu");
		driver.findElement(By.id("file")).sendKeys("C:\\Program Files\\Google\\Chrome\\Application\\chrome.pdf"); //give any pdf file path correctly
		driver.findElement(By.name("relocate")).click();
		driver.findElement(By.name("Submit")).click();
		//38.Javascript popup
		driver.switchTo().alert().accept();
		
		
		
	}

}
