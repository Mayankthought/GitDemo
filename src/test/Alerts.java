package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		String text= "Mayank";
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Driver.findElement(By.id("name")).sendKeys("text");
		Driver.findElement(By.xpath("//input[@value='Alert']")).click();
		Thread.sleep(2000);
		System.out.println(Driver.switchTo().alert().getText());
		Driver.switchTo().alert().accept();
		Driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(Driver.switchTo().alert().getText());
		Driver.switchTo().alert().dismiss();

	}

}
