package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himanshu\\Documents\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.amazon.com/");
		Driver.findElement(By.cssSelector(".a-button-text")).click();
		Thread.sleep(3000);
		Actions a= new Actions(Driver);
		
		WebElement move= Driver.findElement(By.id("nav-link-accountList"));
		
		a.moveToElement(move).contextClick().build().perform();
		a.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		

	}

}
