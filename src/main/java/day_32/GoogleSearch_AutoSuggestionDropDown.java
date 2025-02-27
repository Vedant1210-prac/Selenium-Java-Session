package day_32;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestionDropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List <WebElement> Options = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div/div/div[@class='wM6W7d']//span"));
		
		System.out.println("Count is " +Options.size());
		
		for(WebElement opt : Options) {
			String list = opt.getText();
			System.out.println(list);
			
			if(opt.getText().equals("selenium")){
			
			opt.click();
			}
			
			
		}
		
		/*driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://tutorialsninja.com/demo/index.php");
		*/
		//for(int i = 0; i<Options.size ; i++) {
			
			
		}
	}


