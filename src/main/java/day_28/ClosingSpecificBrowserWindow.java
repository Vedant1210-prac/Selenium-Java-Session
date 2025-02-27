package day_28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		
		String parentID = driver.getWindowHandle();
		
		Set<String> WindowIDs = driver.getWindowHandles();
		
		for(String winID : WindowIDs) {
			
			String title = driver.switchTo().window(winID).getTitle();
		 
			System.out.println(title);
			
			if(title.equals("OrangeHRM")) {
				
				driver.close();
			}
		
		}
		
		//driver.close(); Human Resources Management Software | 
	}

}
