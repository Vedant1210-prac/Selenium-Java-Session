package day_30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p#result"));
		
		if(result.isDisplayed()) {
			
			System.out.println("Alert accepted");
		}*/
		
		
		//2) Confirmation alert both OK and Cancel
		
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss();*/
		
		
		//3) Prompt alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert myalert = driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		
		Thread.sleep(4000);
		myalert.sendKeys("Welcome");
		
		Thread.sleep(4000);
		myalert.accept();
		
		
		
	}

}
