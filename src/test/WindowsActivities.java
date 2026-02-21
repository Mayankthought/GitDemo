package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		Driver.navigate().to("http://www.rahulshettyacademy.com");
		Thread.sleep(2000);
		Driver.navigate().back();
		Thread.sleep(2000);
		Driver.navigate().forward();

	}

}
