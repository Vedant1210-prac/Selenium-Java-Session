package day_31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		driver.manage().window().maximize();
		
		WebElement CountryDrop = driver.findElement(By.cssSelector("select#country-list"));
		
		Select dropObj = new Select(CountryDrop);
		
		
		//Printing all options and count of options
		
		List<WebElement> allOptions = dropObj.getOptions();
		
		System.out.println("Count is  " + allOptions.size());
		
		for(WebElement opt : allOptions) {
			
			System.out.println(opt.getText());
			
		}
		
		//Selecting value
		
		dropObj.selectByIndex(1);
	}

}
