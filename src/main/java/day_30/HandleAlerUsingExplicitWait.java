package day_30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
driver.get("https://the-internet.herokuapp.com/javascript_alerts");


		
		driver.manage().window().maximize();
		
driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Alert myalert = wait.until(ExpectedConditions.alertIsPresent());
		
		
				//until((ExpectedConditions.alertIsPresent()); // alert using explict wait
		
		myalert.accept();
	}

}
