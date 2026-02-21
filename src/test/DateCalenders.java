package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class DateCalenders {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//System.out.println(Driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(Driver.findElement(By.id("Div1")).getDomAttribute("style"));
		
		Driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		//System.out.println(Driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		System.out.println(Driver.findElement(By.id("Div1")).getDomAttribute("style"));
		
		SoftAssert A= new SoftAssert();
		
		A.assertTrue(Driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"), "its enabled");
		//if(Driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		//{
			
		//	System.out.println("its enabled");
		//	Assert.assertTrue(true);
		//}
		//else
		//{
			//Assert.assertTrue(false);
		//}
A.assertAll();
	}

	
}
