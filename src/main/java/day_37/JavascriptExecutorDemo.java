package day_37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args)  {


		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement enterName = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  // need to do Type Casting for WebDriver Object
		
		//JavascriptExecutor js = driver;   // no need to do type casting for ChromeDriver object
		
		//SendKeys operation
		js.executeScript("arguments[0].setAttribute('Value','John')", enterName);
		
		
		//Click action
		
		WebElement radioBtn = driver.findElement(By.cssSelector("input#male"));
		
		js.executeScript("arguments[0].click()", radioBtn);
		
		
		
		
	}

}
