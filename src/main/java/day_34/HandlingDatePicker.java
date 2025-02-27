package day_34;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker {
	
		public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String year;
		String month;
		String date;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//swithing to another frame
		
		driver.switchTo().frame(frame);
		
		//method#1 using SendKeys
		
		//driver.findElement(By.cssSelector("input#datepicker")).sendKeys("01/16/2025");
		
		//Method#2 using date picker
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year");
		
		year = sc.nextLine();
		
		int Year = Integer.parseInt(year);
		
		System.out.println("Enter the Month");
		
		month = sc.nextLine();
		
		System.out.println("Enter the date");
		
		date = sc.nextLine();
		
		
		driver.findElement(By.cssSelector("input#datepicker")).click();
		
		select_Date.selectYear_and_Month(driver, month, year, Year);
		
		
		select_Date.selectDate(driver, date);
		
		
		
		
		
		
		
	}

}
