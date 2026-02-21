package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver= new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.id("inputUsername")).sendKeys("Mayank");
		Driver.findElement(By.name("inputPassword")).sendKeys("test123");
		Driver.findElement(By.className("signInBtn")).click();
		
		//Css selector- 
		//-Tagname[attribute='value']
		
		//using Class name- Tagname.classname=p.error=.error
		
		System.out.println(Driver.findElement(By.cssSelector(".error")).getText());
		
		Driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Xpath- 
				//-//Tagname[@attribute='value']=//input[@placeholder='Name']
				Driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mayank");
		Driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dsffg@tcs.com");
		
		//Xpath using index- 
				//-//Tagname[@attribute='value'][index value]=//input[@type='text'][2]
		Driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//CSS seector using index- 
		//-Tagname[attribute='value']:nth-child(index value)=input[type='text']:nth-child(3)
		Driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("fds@gmail.com");
		
		//Xpath using- //parentTagname/ChilTagname= //form/input[3]
		Driver.findElement(By.xpath("//form/input[3]")).sendKeys("9865432133");
		Driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//CSS using- parentTagname ChilTagname= form p
		System.out.println(Driver.findElement(By.cssSelector("form p")).getText());
		
		Driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		//Reglar expression-
		//CSS-tagname[attribute*='static value']= input[type*='pass']
		Driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Mayank");
		
		//Reglar expression-
				//xpath-tagname[contains (@attribute,'static value']= //button[contains(@class,'submit')]
		Driver.findElement(By.xpath("//input[contains (@type,'pass')]")).sendKeys("rahulshettyacademy");
		
		Driver.findElement(By.cssSelector("#chkboxOne")).click();
		Driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		

	}

}
