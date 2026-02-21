package test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Optecommerce {

		public static void main(String[] args) throws InterruptedException {
			
			
			WebDriver Driver= new ChromeDriver();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//WebDriverWait W = new WebDriverWait(Driver,Duration.ofSeconds(5));
			
			Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			Thread.sleep(3000);
			
String[] ItemsNeeded= {"Cucumber","Cauliflower","Beetroot","Tomato"};
			
			addItems(Driver, ItemsNeeded);
			Driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			Driver.findElement(By.xpath("//div[contains(@class,'cart-preview active')]//button[@type='button']")).click();
			//explicit wait
			//W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
			
			Driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
			Driver.findElement(By.cssSelector(".promoBtn")).click();
			
			//W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
			
			System.out.println(Driver.findElement(By.cssSelector("span.promoInfo")).getText());
			
		}
		

public static void addItems(WebDriver Driver,String[] ItemsNeeded)
{
	
	List<WebElement> products=Driver.findElements(By.cssSelector("h4.product-name"));
	List itemsNeededList = Arrays.asList(ItemsNeeded);
	int j=0;
	
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
