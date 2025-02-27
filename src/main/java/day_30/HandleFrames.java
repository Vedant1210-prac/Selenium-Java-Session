package day_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {


		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		//frame1
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welecome");
		
		
		driver.switchTo().defaultContent();
		
		
		//Frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
		
		//nested frame work
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//b[text()='FileHost']")).getText());
		
		
		//Assignment
		
		driver.switchTo().defaultContent();
		
		//frame 5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.linkText("https://a9t9.com")).click();
		
		//switch to nested iframe
		
		//driver.switchTo().frame(0);
		
		WebElement Logo = driver.findElement(By.cssSelector("a#logo"));
		
		if(Logo.isDisplayed()) {
			
			System.out.println("We are on correct page");
		}else {
			System.out.println("We are on incorrect page");
		}
	
		
		
		
	}

}
