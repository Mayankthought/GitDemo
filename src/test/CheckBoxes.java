package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) {
		
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(Driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		
		//System.out.println(Driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		
		Driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(Driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		
		assert.assertEquals(Driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);

		//System.out.println(Driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
