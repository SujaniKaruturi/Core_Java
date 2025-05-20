package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_8_GetWindowHandle_And_Handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Current/Parent window browser id " + driver.getWindowHandle()); //EBED95BA3AE3AA012C391C437F278DFA
		
		WebElement partial_linkText_Services = driver.findElement(By.partialLinkText("Service"));
		partial_linkText_Services.click();
		Set<String> child_Tab_ID = driver.getWindowHandles();
		System.out.println("Child tab ID "+child_Tab_ID); //EBED95BA3AE3AA012C391C437F278DFA
		//Can parent and child browser id's can be same????
		
		
		
	}

}
