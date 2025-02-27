package day_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		//isDisplayed
		
		/*WebElement  logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']/parent::a"));
		
		System.out.println(logo.isDisplayed());
		*/
		
		
		//isEnabled()
		
		/*WebElement SrchBoxisEnabled = driver.findElement(By.cssSelector("input.search-box-text"));
		
		System.out.println(SrchBoxisEnabled.isEnabled());*/
		
		//isSelected()
		
		WebElement MaleRbtn = driver.findElement(By.cssSelector("input[value='M']"));
		
		WebElement FemaleRbtn = driver.findElement(By.xpath("//input[@value='F']"));
		
		System.out.println("BeforeSelecting Radio Btn....");
		
		System.out.println(MaleRbtn.isSelected());
		
		System.out.println(FemaleRbtn.isSelected());
		
		
		MaleRbtn.click();
		System.out.println("After Selecting....");
		System.out.println(MaleRbtn.isSelected());
		
		
		boolean Newletter = driver.findElement(By.xpath("//input[@value='true' and @type='checkbox']")).isSelected();
		
		System.out.println(Newletter);
		
		
		
	}

}
