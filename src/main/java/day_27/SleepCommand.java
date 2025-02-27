package day_27;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {
	
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		driver.findElement((By.xpath("//a[contains(text(), 'OrangeHRM')]"))).click();
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
		
		FileUtils.copyFile(source, new File("C:/User/VEBHURE/OneDrive - Capgemini/screen.png"));
		}
		catch(Exception E) {
			
			E.printStackTrace();
		}
		
		
		
		
	}

}
