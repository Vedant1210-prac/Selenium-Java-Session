package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment01 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement copyBtn = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		//Javascript for scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", copyBtn); 
		
		//Action class
		Actions action = new Actions(driver);
		
		//double click
		action.doubleClick(copyBtn).perform();
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		String Text1 = field1.getAttribute("Value");
		
		String Text2 = field2.getAttribute("Value");
		
		System.out.println(Text1 + " " + " " +Text2);
		
		
		//DragAndDrop
		
		WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//action.dragAndDrop(Source, target).perform();
		
		test.DragAndDrop(driver, Source, target);
		
		if(driver.findElement(By.xpath("//p[text()='Dropped!']")).isDisplayed()) {
			
			System.out.println("Element Dropped Successfully");
		}else {
			
			System.out.println("unsucessfull");
		}
		
		
		
		

	}

}
