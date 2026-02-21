package test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver Driver= new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
	Driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");
	Driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
	Thread.sleep(3000);
	Driver.findElement(By.id("okayBtn")).click();
	WebElement staticValue=Driver.findElement(By.xpath("//div[@class='form-group']/select[@data-style='btn-info']"));
	
	Select DD= new Select(staticValue);
	DD.selectByIndex(2);
	DD.getFirstSelectedOption();
	Driver.findElement(By.cssSelector("input[type='submit']")).click();
	
	String[] BrandNeded= {"iphone","Samsung","Nokia"};
	List<WebElement> Products= Driver.findElements(By.cssSelector("h4.card-title"));
	List BrandNededList = Arrays.asList(BrandNeded);
	int j=0;
	for(int i=0; i<Products.size(); i++)
	{
		 String[] Name=Products.get(i).getText().split(" ");
		 String FinalName=Name[0].trim();
		 
		 if(BrandNededList.contains(FinalName))
		 {
			 j++;
			 Driver.findElement(By.xpath("//div[@class='card-footer']//button[@class='btn btn-info']")).click();
			 
			 if(j==BrandNeded.length)
			 {
				 break;
			 }
		 }
				 
		
	}
	
	
	

	}

}
