package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
		
		//Switching to Frame
		WebElement  frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		
		WebElement Box1 = driver.findElement(By.cssSelector("input#field1"));
		WebElement Box2 = driver.findElement(By.cssSelector("input#field2"));
		
		Box1.clear();
		Box1.sendKeys("Job Needed");
		//Double click Action
		
		WebElement copyTextBtn = driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(copyTextBtn).perform();
		
		//Copied value
		//Copied Successfully

		/*if(Box2.getText().equals(Box1.getText())) {
			System.out.println(" Copied value" +Box2.getText());  
			System.out.println("Copied Successfully");
		}*/
		
		String text1 = Box1.getAttribute("value");
		String text2 = Box2.getAttribute("value");
		
		System.out.println("first text " +text1+ " " + "second text" +text2);
		
		if(text1.equals(text2)) {
			System.out.println("Copied Successfully");
		}
				
	
	}

}
