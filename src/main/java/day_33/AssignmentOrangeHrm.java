package day_33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOrangeHrm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String UserName_String = driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText();
		
		String Username = UserName_String.substring(11, 16);
		
		String Password_String = driver.findElement(By.xpath("//p[normalize-space()='Password : admin123']")).getText();
		
		String Password = Password_String.substring(11, 19);   //Password : admin123
		
		System.out.println(Username + Password);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Username);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);		
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
