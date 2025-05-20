package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//19. WAP on dropdown handling using registration form for skills,country and religion
public class S_19_GroTechMinds_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement skills= driver.findElement(By.id("Skills"));
		Select s=new Select(skills);
		s.selectByIndex(2);
		WebElement religion= driver.findElement(By.id("Relegion"));
		Select s2=new Select(religion);
		s2.selectByVisibleText("Hindu");
		WebElement country= driver.findElement(By.id("Country"));
		Select s1=new Select(country);
		s1.selectByValue("India");
		
		
	}

}
