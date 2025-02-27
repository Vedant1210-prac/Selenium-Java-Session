package day_36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Hello Welcome");
		
		
		Actions action = new Actions(driver);
		
		
		//Ctrl + A action select the text
		
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		
		//Ctrl + C to copy
		
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		
		//tab shift to next box
		
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		
		//Ctrl + V  to paste
		
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
