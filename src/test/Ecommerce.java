package test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver Driver= new ChromeDriver();
		int j=0;
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		List<WebElement> products=Driver.findElements(By.cssSelector("h4.product-name"));
		
		String[] ItemsNeeded= {"Cucumber","Cauliflower","Beetroot","Tomato"};
		
		List itemsNeededList = Arrays.asList(ItemsNeeded);
		
		for(int i=0; i<products.size(); i++ )
		{
			String[] name=products.get(i).getText().split("-");
			String FormattedName=name[0].trim();
			
			
			if(itemsNeededList.contains(FormattedName))
			{
				
				j++;
				Driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
	
				if(j==ItemsNeeded.length)
				{
					break;
				}
			}
		}

	}

}
