package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//12. WAP for Tagname locator using learning HTML file
public class S_12_TagName_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/GrowtechMind/learningHTML1.html");
		WebElement url_Click = driver.findElement(By.tagName("a"));
		url_Click.click();
		driver.close();
	}

}
