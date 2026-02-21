package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		//
		Driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='BHO']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("(//td[@class='mapbg'] //a[@value='PNQ'])[2]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		System.out.println("ho gya");
		
		
	}

}
