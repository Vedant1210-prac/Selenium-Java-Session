package day_34;

import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDatePicker2 {
	
	static Month convertMonth(String month) {
		
		HashMap<String, Month> MonthMap = new HashMap<String, Month>();
		
		MonthMap.put("Jan", Month.JANUARY);
		MonthMap.put("Feb", Month.FEBRUARY);
		MonthMap.put("Mar", Month.MARCH);
		MonthMap.put("Apr", Month.APRIL);
		MonthMap.put("May", Month.MAY);
		MonthMap.put("Jun", Month.JUNE);
		MonthMap.put("Jul", Month.JULY);
		MonthMap.put("Aug", Month.AUGUST);
		MonthMap.put("Sep", Month.SEPTEMBER);
		MonthMap.put("Oct", Month.OCTOBER);
		MonthMap.put("Nov", Month.NOVEMBER);
		MonthMap.put("Dec", Month.DECEMBER);
		
		Month vmonth = MonthMap.get(month);
		
		if(vmonth==null) {
			
			System.out.println("invalid month");
			
		}
		
		return vmonth;
		
		}

	public static void main(String[] args) {

 
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		String year;
		String month;
		String date;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year");
		year = sc.nextLine();
		
		System.out.println("Enter the Month");
		month = sc.nextLine();
		
		System.out.println("Enter the date");
		date = sc.nextLine();
		
		int Year =Integer.parseInt(year);
		driver.findElement(By.cssSelector("input[name=SelectedDate]")).click();
		
		//Method 1
		
	Select_Date2.selectMonth_and_Year(driver, month, year);
	Select_Date2.select_date(driver, date, Year);
	
		
				
		
		/*//Method 2
		//Select Year
				WebElement year_DropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select YearObj = new Select(year_DropDown);
				YearObj.selectByVisibleText(year);
				
				
			
				while(true) {
					
					String currentMonth = driver.findElement(By.xpath("//select[@aria-label='Select month']")).getText();
					
					Month expectedMonth=convertMonth(month);
					Month displayMonth = convertMonth(currentMonth);
					
					int result = expectedMonth.compareTo(displayMonth);
					
					//0 current month
					//>0 future month
					//<0  past
					
					if(result > 0) {
						
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						
					} 
					else if(result < 0) {
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
					}
					else {
						break;
					}
					
				}
				
				//select date
				List<WebElement> Date_List = driver.findElements(By.xpath("//table/tbody/tr/td[@data-handler='selectDay']"));
				int count = Date_List.size();
				
				for(WebElement datelist : Date_List) {
					
					if(datelist.getText().equals(date)) {
						
						datelist.click();
					}
					
				}*/
				
	}

}
