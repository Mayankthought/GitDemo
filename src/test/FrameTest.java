package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://jqueryui.com/droppable/");
		Driver.switchTo().frame(Driver.findElement(By.className("demo-frame")));
		System.out.println(Driver.findElements(By.tagName("iframe")).size());
		//Driver.switchTo().frame(0);
		Driver.findElement(By.id("draggable")).click();
		Actions a= new Actions(Driver);
		WebElement source= Driver.findElement(By.id("draggable"));
		WebElement target= Driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		Driver.switchTo().defaultContent();

	}

}
