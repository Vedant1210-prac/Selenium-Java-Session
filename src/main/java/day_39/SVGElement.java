package day_39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) {


WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String MainUserNameText= driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText();
		
		String MainPasswordText = driver.findElement(By.xpath("//p[normalize-space()='Password : admin123']")).getText();
		
		String userName = MainUserNameText.substring(11,16);
		
		System.out.println(userName);
		
		String Password = MainPasswordText.substring(11,19);
		
		System.out.println(Password);
		
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys(userName);
		
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys(Password);
		
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		
		//identify SVG element
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']/*[name()='svg']")).click();
		
	}

}
