package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//16.  Write a code to hoverover demo 1 and click on practice 3
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_16_17_18_Grotechminds {
	static void hoverover_Ass16() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement demo1=driver.findElement(By.xpath("//div[contains(@class,'has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child')]"));
		Actions f=new Actions(driver);
		f.moveToElement(demo1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='toolriptext4'])[1]/div[3]")).click();	//Practice3
	}
	static void dragAndArop_Ass17() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement dragElement = driver.findElement(By.xpath("//div[@id='container']/img"));	//Cucumber element
		WebElement dropLocation = driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(dragElement, dropLocation).perform();
	}
	//WAP to drag and drop and revert the dragged element at its original position.
	static void dragAndArop_Revert_Ass18() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement dragElement = driver.findElement(By.xpath("//div[@id='container']"));	//Cucumber element
		WebElement dropLocation = driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(dragElement, dropLocation).perform();
		System.out.println("Drag and Drop is done");
		Thread.sleep(10000);
		a.dragAndDrop(dropLocation, dragElement).perform();
		System.out.println("Reverse Drag and Drop is done");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//hoverover_Ass16();
		//dragAndArop_Ass17();
		dragAndArop_Revert_Ass18();
	}

}
