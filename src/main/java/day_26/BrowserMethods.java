package day_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		
		Thread.sleep(5000);
		
		//driver.close(); // will close the single driver where we have driver is available
		
		driver.quit(); // will close all the opened windows 
		
		
	}

}
