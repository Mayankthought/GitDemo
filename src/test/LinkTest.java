package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(Driver.findElements(By.tagName("a")).size());//Links on page
		WebElement footer= Driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		System.out.println(footer.findElements(By.tagName("a")).size());//Links in footer
		
		WebElement footersection=footer.findElement(By.cssSelector(" table tbody tr td:nth-child(1)"));
		System.out.println(footersection.findElements(By.tagName("a")).size());//Links in footersection
		
		//click on each links in a section
		
		for(int i=1; i<footersection.findElements(By.tagName("a")).size(); i++ )
		{
			String clickonLink=Keys.chord(Keys.CONTROL,Keys.ENTER);//control click
			
			footersection.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
			Thread.sleep(5000);
		}
		Set<String> windowsavailable= Driver.getWindowHandles();//4 windows available
		Iterator<String> it=windowsavailable.iterator();
		
		while(it.hasNext())
		{
			Driver.switchTo().window(it.next());
			System.out.println(Driver.getTitle());
			
		}

	}

}
