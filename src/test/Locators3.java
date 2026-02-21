package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		
		WebDriver Driver= new ChromeDriver();
		Driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");
		//Siblings- Parent to child
		System.out.println(Driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		
		
	}

}
