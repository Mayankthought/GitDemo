package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		WebElement staticDD=(Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		Select dropdown= new Select(staticDD);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		

	}
	
}
