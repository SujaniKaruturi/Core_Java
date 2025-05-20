package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//33. Launch amazon,search shoe click on 1st shoe and add to cart.
//40. 
public class S_33_AddToCart_Amazon {

	static void AddToCart_Amazon()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes" + Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
		
		//Switch and give control to child tab
		Set<String> pandc=driver.getWindowHandles();
		System.out.println("All browser id's are  "+ pandc);
		Iterator<String> i=pandc.iterator();
		String parent= i.next();
		String child= i.next();
		System.out.println("Parent browser id "+ parent + "Child browser is "+ child);
		driver.switchTo().window(child);
		//add to cart
		driver.findElement(By.id("add-to-cart-button")).click();
	}
	static void AddToWishlist_Amazon()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes" + Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
		
		//Switch and give control to child tab
		Set<String> pandc=driver.getWindowHandles();
		System.out.println("All browser id's are  "+ pandc);
		Iterator<String> i=pandc.iterator();
		String parent= i.next();
		String child= i.next();
		System.out.println("Parent browser id "+ parent + "  And Child browser id is "+ child);
		driver.switchTo().window(child);
		//add to wishlist
		driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddToCart_Amazon();
		AddToWishlist_Amazon();
	}

}
