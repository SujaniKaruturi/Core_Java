package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//20.Launch google,Type Bangalore and from auto suggestion select 6th option
//21.Launch amazon type shoe and select 2nd option from auto suggestion
//22. Launch flipkart type mobile and select last option from auto suggestion
//23. Launch google,Type Bangalore and print all options from auto suggestions
//24.Amazon ,shoe,print all auto suggestion values
//25. Flipkart ,search mobile, print all auto suggestion values

public class S_20_25_AutoSuggestion {

	static void auto_Suggestion() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Bangalore");
		Thread.sleep(5000);
		List<WebElement> Bang_Auto_sug = driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul/li"));
		int count =Bang_Auto_sug.size();
		//Bang_Auto_sug.get(5).click();
		//Bang_Auto_sug.get(count-4).click();
		System.out.println("Count of autosuggestion is  " + count);
		for(int i=0; i<count; i++)
		{
			System.out.println(i + " autosuggestion text is  " + Bang_Auto_sug.get(i).getText());
		}
		
	}
	static public void search_Shoe_Using_Autosuggestion() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoe"); //Search mobile in search input
		Thread.sleep(4000);   //Wait time resolves issue count is 0.Without wait time ,it throws error count is 0.
		List<WebElement> as1 =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count1 = as1.size();
		System.out.println("Count of autosuggestion is  " + count1);
		//as1.get(count1-8).click();
		System.out.println("Clicked");
		for(int i=0; i<count1; i++)
		{
			System.out.println(i + " autosuggestion text is  " + as1.get(i).getText());
		}
	}
	static public void search_Mobiles_Using_Autosuggestion() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Mobiles"); //Search mobile in search input
		Thread.sleep(4000);   //Wait time resolves issue count is 0.Without wait time ,it throws error count is 0.
		List<WebElement> as1 =driver.findElements(By.xpath("//div[@class='_3NorZ0 _3jeYYh']/form/ul/li"));
		int count1 = as1.size();
		System.out.println("Count of autosuggestion is  " + count1);
		//as1.get(count1-1).click();
		System.out.println("Clicked");
		for(int i=0; i<count1; i++)
		{
			System.out.println(i + " autosuggestion text is  " + as1.get(i).getText());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		auto_Suggestion();
		search_Shoe_Using_Autosuggestion();
		search_Mobiles_Using_Autosuggestion();
		
	}

}
