package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_9_HTML_Application_AbsolutePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/GrowtechMind/learningHTML1.html");
		WebElement txtBox_UsrName = driver.findElement(By.xpath("(/html/body/input)[1]"));
		txtBox_UsrName.sendKeys("Pradnya");
		WebElement txtBox_Hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		txtBox_Hint.sendKeys("Your Name");
		WebElement txtBox_pwd = driver.findElement(By.xpath("(/html/body/input)[3]"));
		txtBox_pwd.sendKeys("Pradnya@1234");
		WebElement txtBox_YourFName = driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		txtBox_YourFName.sendKeys("Pradnya");
		WebElement chkBox_1 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		chkBox_1.click();
		WebElement chkBox_2 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		chkBox_2.click();
		WebElement chkBox_3 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		chkBox_3.click();
		WebElement btn_radio_1 = driver.findElement(By.xpath("(/html/body/input)[4]"));
		btn_radio_1.click();
		WebElement btn_radio_2 = driver.findElement(By.xpath("(/html/body/input)[5]"));
		btn_radio_2.click();
		WebElement chkBox_4 = driver.findElement(By.xpath("(/html/body/input)[6]"));
		chkBox_4.click();
	}

}
