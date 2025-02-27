package day_36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenPageInNewTab {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		WebElement featureBtn = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(), 'Features')]"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(featureBtn).keyUp(Keys.CONTROL).perform();
		
		//switching to another window
		
		Set<String> windowID = driver.getWindowHandles();
		
		List<String> windowIDList = new ArrayList(windowID);
		
		
		driver.switchTo().window(windowIDList.get(1));
		
		WebElement HeaderOnFeaturePage = driver.findElement(By.xpath("//h1[text()='OpenCart Features']"));
		
		if(HeaderOnFeaturePage.isDisplayed()) {
			
			System.out.println("We are on Features Page");
			
		}
		else {
			System.out.println("invalid page....");
					
		}
		
		
		
		
	}

}
