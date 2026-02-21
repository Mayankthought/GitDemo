package test;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchFIlter {

	public static void main(String[] args) {
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Rice");
		List <WebElement> veggies=Driver.findElements(By.xpath("//tr/td[1]"));
		//1
		List<WebElement> veg=veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		//1
		Assert.assertEquals(veggies.size(), veg.size());
	}

}
