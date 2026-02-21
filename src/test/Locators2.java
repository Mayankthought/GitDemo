package test;

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name="Mayank";
		
		WebDriver Driver= new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.id("inputUsername")).sendKeys(name);
		Driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
        System.out.println(Driver.findElement(By.tagName("p")).getText());
        
        Assert.assertEquals(Driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(Driver.findElement(By.cssSelector("div[class*='login'] h2")).getText(),"Hello "+name+",");
        Driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Driver.close();
	}

}
