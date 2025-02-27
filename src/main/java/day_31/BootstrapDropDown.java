package day_31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//Select Single option
		
		//driver.findElement(By.xpath("//input[@value='Python']")).click();
		
		//2) Capturing all the options from dropdown
		
		List<WebElement> Options = driver.findElements(By.xpath("//label[@class='checkbox']"));	
		
		System.out.println("Total number of Options " +Options.size());
		
		//System.out.println(Options.get(5).getText());
		
		
		//Printing all the application
		
		/*for(WebElement op : Options) {
			System.out.println(op.getText());
		}*/
		
		
		//Select particular Options
		
		for(WebElement Op : Options) {
			
			String option = Op.getText();
			
			if(option.equals("Python") || option.equals("Oracle") || option.equals("C#")) {
				
				Op.click();
			}
		}
	}

}
