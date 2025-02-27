package day_30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestediFrame {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='analystic' and text()='Iframe with in an Iframe']")).click();
		
		WebElement frame1= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1);
		String Text1 = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println("Switched to " +Text1);
		
		
		WebElement frame2= driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));

		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@type='text' and @xpath='1']")).sendKeys("Welcome");
	}

}
