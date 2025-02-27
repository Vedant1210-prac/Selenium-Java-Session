package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.opencart.com/");
		
		WebElement desktopBtn = driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		WebElement macbtn = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions action = new Actions(driver);
		
		//mouse hover
		//action.moveToElement(desktopBtn).moveToElement(macbtn).click().perform();
		
		action.moveToElement(desktopBtn).moveToElement(macbtn).click().build().perform();
		
		
	}

}
