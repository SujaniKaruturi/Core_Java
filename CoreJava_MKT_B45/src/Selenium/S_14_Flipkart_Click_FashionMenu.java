package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP in flipkart ,click on fashion menu using xpath using text message
public class S_14_Flipkart_Click_FashionMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[.='Fashion'])[2]")).click();
		
		
	}

}
