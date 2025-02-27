package day_27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCommand {

	public static void main(String[] args) {
		
		

		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//WebElement newTab = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'OrangeHRM')]")));
		
		WebElement newTab = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'OrangeHRM')]")));
		


		//driver.findElement((By.xpath("//a[contains(text(), 'OrangeHRM')]"))).click();
		
		newTab.click();
		
	}

}
