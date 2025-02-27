package day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//tag#Id
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("ABC");
		
		//tag and class   tag.class
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Tshirt");
		
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Tshirt");
		
		
		//tag attribute  tag[attribute = "value"]
		
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Tshirt");
		
		
		//tag class attribute  tag.classname[attribute="value"]
		
		driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("TShirt");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.cssSelector("span.cart-label")).click();
		
		
		
		
		
		
	}

}
