package day_34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Date2 {
	
	
	static void selectMonth_and_Year(WebDriver driver, String month, String year) {
		//Select month
		
				WebElement month_DropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
				Select MonthObj = new Select(month_DropDown);
				MonthObj.selectByVisibleText(month);

				//Select Year
				WebElement year_DropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select YearObj = new Select(year_DropDown);
				YearObj.selectByVisibleText(year);
	}
	
	
	static void select_date(WebDriver driver, String date, int Year) {
		//select date
				List<WebElement> Date_List = driver.findElements(By.xpath("//table/tbody/tr/td[@data-handler='selectDay']"));
				int count = Date_List.size();
				
			for(WebElement datelist : Date_List) {
				if(Year % 4 ==0 ) {
					if(datelist.getText().equals(date)) {
						
						datelist.click();
						}
				}else{ 
					if(datelist.getText().equalsIgnoreCase("29")) {
						System.out.println("29 is in valid date This is not leap year");
					
				}else if(datelist.getText().equals(date)) {
					
						datelist.click();
					}
					
					 
				}
}
			
	}

}
