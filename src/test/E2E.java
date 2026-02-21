package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

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
		if(Driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
		{
			
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		int i=1;

		while(i<5)
			
		{
			
			Driver.findElement(By.id("divpaxinfo")).click();
			i++;
		}
		Driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		System.out.println("Successfull");
		
	}

}
