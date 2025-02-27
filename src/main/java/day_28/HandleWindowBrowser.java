package day_28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowBrowser {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		
		String parentID = driver.getWindowHandle();
		
		Set<String> WindowIDs = driver.getWindowHandles();
		
		/*//Approach 1
		
		List<String> WindowList = new ArrayList(WindowIDs);
		
		String parentId = WindowList.get(0);
		
		String childID = WindowList.get(1);
		
		//SwitchTo window childID
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.getTitle());
		
		//SwitchTo window parentID
		
		driver.switchTo().window(parentId);
		
		System.out.println(driver.getTitle());
	*/	
		
		//Approach 2
		
		for(String winID : WindowIDs) {
			
			String Title = driver.switchTo().window(winID).getTitle();
			
			if(!winID.equals(parentID)) {
				System.out.println(driver.getTitle());
			}
			
			/*if(!Title.equals("OrangeHRM1")) {
				System.out.println(driver.getCurrentUrl());
			}*/
			
		}
	}

}
