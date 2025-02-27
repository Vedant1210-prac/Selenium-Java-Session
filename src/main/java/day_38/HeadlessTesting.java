package day_38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement title = driver.findElement(By.cssSelector("h1.title"));
		
		File sourceoftitle = title.getScreenshotAs(OutputType.FILE);
		
		File targetoftitle = new File(System.getProperty("user.dir")+"\\screenShots\\title.png");
		
		sourceoftitle.renameTo(targetoftitle);
		
		
		
		
	}

}
