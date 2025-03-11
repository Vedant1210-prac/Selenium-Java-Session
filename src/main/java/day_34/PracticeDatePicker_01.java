package day_34;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeDatePicker_01 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
		
		String month = "May" ;
		String year = "2025" ;
		String Date = "10";
		
		/*Scanner sc = new Scanner(System.in);
		
		//Date
		System.out.println("Date");
		Date = sc.nextLine();
		
		//Month
		System.out.println("Month");
		month = sc.nextLine();
		
		//Year
		System.out.println("Year");
		year = sc.nextLine();
		*/
		int exp_year = Integer.parseInt(year);
		
		//driver.findElement(By.xpath("//div[@style='cursor: pointer;']/*[name()='svg']")).click();
		
		
		
		while(true) {
			
			String act_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String act_Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			int Newyear = Integer.parseInt(act_Year);
			
			if(act_month.equalsIgnoreCase(month) && act_Year.equalsIgnoreCase(year)) {
				break;
			}
			
			if(exp_year< Newyear) {
				
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}else {
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			
		}
		
		
		List<WebElement> DateList = driver.findElements(By.xpath("//td/a"));
		
		for(WebElement date : DateList) {
			
			if(date.getText().equals(Date)) {
				date.click();
			}
		}
		
		
	}

}
