package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_39_JavaScript_PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click ']")).click();
		driver.switchTo().alert().accept();
	}

}
