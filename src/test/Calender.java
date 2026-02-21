package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		
		String monthNumber= "6";
		String Date="15";
		String year="2027";
		//String[] finalDate= {monthNumber,Date,year};
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon.react-date-picker__button__icon")).click();
		Driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		Driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		Driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		Driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		Driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
		List<WebElement> expectedDate= Driver.findElements(By.cssSelector(".react-date-picker__inputGroup"));
		
		for (int i=0; i<expectedDate.size(); i++)
		{
		    System.out.print(expectedDate.get(i).getDomAttribute("value"));  // will print day month year
		}
	}

}
