package day_34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class select_Date {
	
	//select month and year
		static void selectYear_and_Month(WebDriver driver , String month, String year, int Year) {
			
			
					while(true) {
						String actual_Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
						String actual_Year  = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
						
						if(actual_Month.equals(month) && actual_Year.equals(year)) {
							
							break;
						}
						
						int actual_year = Integer.parseInt(actual_Year);
						
						if(actual_year < Year) {
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
						
						}else {
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
						}
						
					}
		}
		
		static void selectDate(WebDriver driver, String date) {
			
			//select date
			
					List<WebElement> Date_list = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
					
					int count = Date_list.size();
					
					for(int i=1 ; i<=count-1; i++) {
						
						if(Date_list.get(i).getText().equals(date)) {
							
							Date_list.get(i).click();
							
						}
					}
		}



}
