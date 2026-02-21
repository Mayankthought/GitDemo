package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		WebDriver Driver= new ChromeDriver();
		
		Driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();
		Set<String> windows= Driver.getWindowHandles();
		Iterator <String> it=windows.iterator();
		String parentid=it.next();//Parentid
		String childid =it.next();//childid
		
		Driver.switchTo().window(childid);
		System.out.println(Driver.findElement(By.cssSelector("p.im-para.red")).getText());
		
		String text= Driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1];
		String email=text.trim().split(" ")[0];
		//String[] formattedText=text.split("at");
		//String[] email=formattedText[1].trim().split(" ");
		//String exactEmail =email[0];
		Driver.switchTo().window(parentid);
		Driver.findElement(By.id("username")).sendKeys(email);

	}

}
