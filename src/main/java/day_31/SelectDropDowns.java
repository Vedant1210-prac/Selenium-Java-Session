package day_31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDowns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://testautomationpractice.blogspot.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement dropdownEle = driver.findElement(By.cssSelector("select#country"));
		
		Select dropdownObj = new Select(dropdownEle);
		
		//Select by Visible Text
		
		//dropdownObj.selectByVisibleText("Australia");
		
		//Select by value
		
		//dropdownObj.selectByValue("china");
		
		//Select by index
		
		dropdownObj.selectByIndex(3);
		
		//Capture the options from the dropdown
		
		List<WebElement> Options = dropdownObj.getOptions();
		
		System.out.println("Number of Options in dropdown " + Options.size());
		
		
		
		//Print the all the options
		/*for(int i = 0; i<Options.size()-1; i++) {
			
			System.out.println(Options.get(i).getText());
		}
		*/
		
		//enhanced for loop
		
		for(WebElement opt : Options) {
			
			System.out.println(opt.getText());
		}
		
		
	}

}
