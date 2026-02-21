package test;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on coloumn
		Driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
		
		//Capture all webEelments in to List
		List<WebElement> veg=Driver.findElements(By.cssSelector("tr td:nth-child(1)"));
		
		
		//capture text of all webElements in to list(new original list)
		List<String> originalList=veg.stream().map(s->s.getText()).collect(Collectors.toList());
		
		
		//sort the original list=sorted list
		List <String> sortedlist=originalList.stream().sorted().collect(Collectors.toList());
		
		
		//compare original list vs sorted list
		
		Assert.assertTrue(originalList.equals(sortedlist));
		
		List<String> price;
		//Scan the name column with get text-> Print the Price of beans
		do {
			List<WebElement> veg1=Driver.findElements(By.cssSelector("tr td:nth-child(1)"));
		price=veg1.stream().filter(s->s.getText().contains("Strawberry"))
				.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1)
		{
			Driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);

	}

	private static String getPriceVeggie(WebElement s) {
		
		String  priceVale=s.findElement(By.xpath("following::td[1]")).getText();
		return priceVale;
	}

}
