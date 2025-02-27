package day_32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentOfDemoBlaze {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Departure = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select DepartureObj = new Select(Departure);
		
		DepartureObj.selectByValue("Boston");
		
		
		WebElement Destination = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select DestinationObj = new Select(Destination);
		
		DestinationObj.selectByValue("London");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// total rows
		
		int rows = driver.findElements(By.xpath("//table//tr")).size();
		
		System.out.println("Total rows are " +rows);
		
		//total columns
		
		int cols = driver.findElements(By.xpath("//table//th")).size();
		
		double lowestPrice = Double.MAX_VALUE;
		
		System.out.println("Totals columns are " +cols);
		//double minPrice = 0.0;
		/*for(int r = 1 ; r<=rows-1; r++ ) {
			
			String price = driver.findElement(By.xpath("//table//tr["+r+"]/td[6]")).getText();
			
			System.out.println(price);
			
			price.replace("$", "");
			
			double Price = Double.parseDouble(price);
			
			System.out.println(Price);
			 
			
		}*/
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions)
		
		List<WebElement> priceList = driver.findElements(By.xpath("//table//tr/td[6]"));
		
		
		
		for(WebElement price : priceList) {
			
			String PriceText = price.getText().replace("$", "");
			
			
		
			
			   //PriceText.toCharArray();
			
			double priceValue = Double.parseDouble(PriceText);
			
			if(priceValue < lowestPrice) {
				lowestPrice = priceValue;
				
				
			}
			
			if(priceValue == lowestPrice) {
				
				driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).click();
			}
			
			
		}
		
		
		
		System.out.println(lowestPrice);
		
		
		
		/*for(int i = 0; i<=priceList.size(); i++) {
			
			for(int j = i+1; j<priceList.size(); j++) {
				
				if(priceList.get(i) )
			}
			
		}*/
  		
		
	}

}
