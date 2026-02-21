package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/");
		Driver.findElement(By.xpath("//a[@href='/windows']")).click();
		Thread.sleep(3000);
		
		Driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		System.out.println(Driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		
		System.out.println(Driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		

	}

}
