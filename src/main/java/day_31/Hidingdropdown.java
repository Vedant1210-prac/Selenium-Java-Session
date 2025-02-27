package day_31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidingdropdown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		driver.findElement(By.xpath("//div/span[text()='Freelance']")).click();
		//Select Single Value from dropdwon
		
		/*WebElement singleOpt= driver.findElement(By.xpath("//div/span[text()='Full-Time Permanent']"));
		
		singleOpt.click();*/
		
		//Print all the options in dropdown
		
		List<WebElement> Options = driver.findElements(By.xpath("//div[@role='listbox']/div/span"));
		System.out.println("Number of Options are " +Options.size());
		for(int i = 0 ; i < Options.size(); i++) {
			
			System.out.println(Options.get(i).getText());
		}
		
	
	}

}
