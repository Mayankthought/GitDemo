package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		int i=1;
		
		for(i=1; i<5; i++)
		{
			Driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		while(i<5)
			
		{
			
			Driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		
		Driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(Driver.findElement(By.id("divpaxinfo")).getText());
	}

}
