package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://demo.guru99.com/test/drag_drop.html");

WebElement securityBtn = driver.findElement(By.xpath("//li/a[text()='Security Project']"));

Actions act = new Actions(driver);

Action openInNewTab =act.keyDown(Keys.CONTROL).click(securityBtn).keyUp(Keys.CONTROL).build();

openInNewTab.perform();

	}

}
