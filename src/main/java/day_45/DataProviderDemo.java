package day_45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo {
	
	static WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test(dataProvider="dp")
	void login(String email, String pass) {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		
		if(status == true) {
			
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//li[5]/a[text()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else {
			
			Assert.fail();
		}
		
	}

	@AfterClass
	void teardown() {
		
		driver.close();
	}
	
	
	@DataProvider(name="dp", indices={0,1,3})
	Object[][] loginData() {
		
		Object data[][]= {{"abc10@yahoo.com","Test@123"},
						  {"abc11@yahoo.com", "Test@124"},
						  {"abc12@yahoo.com", "Test@125"},
						  {"abc13@yahoo.com", "Test@125"},
		};
		
		return data;
		}
	}

