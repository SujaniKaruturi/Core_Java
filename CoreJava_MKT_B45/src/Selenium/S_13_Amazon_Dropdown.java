package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//13. Launch Amazon ,select a category as books, search a book called Power of minds and press enter using xpath
public class S_13_Amazon_Dropdown {
	public void search_Book_Using_Autosuggestion() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Book"); //Search mobile in search input
		Thread.sleep(4000);   //Wait time resolves issue count is 0.Without wait time ,it throws error count is 0.
		List<WebElement> as1 =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count1 = as1.size();
		System.out.println("Count of autosuggestion is  " + count1);
		as1.get(count1-4).click();
		System.out.println("Clicked");
	}
	public void search_Dropdown()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement selectDropdownvalue=driver.findElement(By.id("searchDropdownBox"));
		Select h=new Select(selectDropdownvalue);		//Dropdown
		h.selectByVisibleText("Books");
		//h.selectByValue("Baby");
		//h.selectByIndex(4);
		WebElement search_particular_Book=driver.findElement(By.id("twotabsearchtextbox"));
		search_particular_Book.sendKeys("Power of Mind");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
	}
	public static void main(String[] args) throws InterruptedException{
		S_13_Amazon_Dropdown i =new S_13_Amazon_Dropdown();
		//i.search_Book_Using_Autosuggestion();
		i.search_Dropdown();
	}

}
