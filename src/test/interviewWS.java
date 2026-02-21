package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class interviewWS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js= (JavascriptExecutor)Driver;
		js.executeScript("window.scrollBy(0,500)");

		
		System.out.println(Driver.findElement(By.xpath("//button[@id='mousehover']")).getText());
		Driver.findElement(By.xpath("//button[@id='mousehover']")).click();
	}

}
