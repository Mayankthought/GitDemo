package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class WindowsCommand {

	public static void main(String[] args) throws IOException {
		WebDriver Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/#/");
		
		File src=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Himanshu\\screenshot.png"));

	}

}
