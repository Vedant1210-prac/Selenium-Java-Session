package day_42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Open application
 * test logo present
 * login
 * logout
 * 
 */

import org.testng.annotations.Test;

public class OrangeHRMTest {
	WebDriver driver;
	
	@Test(priority=1)
  public void openApp() {
		
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
  }
	
	
	@Test(priority=2)
	public void testLogo() {
		
		WebElement Logo = driver.findElement(By.xpath("//div/img[@src='/web/images/ohrm_branding.png?v=1721393199309']"));
		 if(Logo.isDisplayed()) {
			 System.out.println("Url opened successfully");
		 }else {
			 
			 System.out.println("Unsuccessful");
		 }
		
	}
	
	@Test(priority=3)
	public void login() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=4)
	public void logout() {
		
		driver.findElement(By.xpath("//p[contains(@class, 'oxd-userdropdown-name')] ")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		WebElement LoginLogo = driver.findElement(By.tagName("h5"));
		
		if(LoginLogo.isDisplayed()) {
			
			System.out.println("Logout successful");
		}else {
			System.out.println("Logout unsuccessful");
		}
		
		
		
	}
}
