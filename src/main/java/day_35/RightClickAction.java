package day_35;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Demo']")).click();
		
		WebElement Btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//Right Click action
		
		Actions action = new Actions(driver);
		
		action.contextClick(Btn).perform();
		Thread.sleep(5000);
		//Click on Copy
		WebElement CopyBtn = driver.findElement(By.xpath("//span[text()='Copy']"));
		action.moveToElement(CopyBtn).click().perform();
		
		//Handling Alert
		driver.switchTo().alert().accept();
		
		
	}

}
