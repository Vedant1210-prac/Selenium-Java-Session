package day_45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	static WebDriver driver;
	//static String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	
	@BeforeClass @Parameters({"browser", "url"})
	void Setup(String br, String url) throws InterruptedException {
		
		/*switch(br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver(); 
		break;
		case "edge": driver = new EdgeDriver();
		break;
		default: System.out.println("invalid browser");
		return;
		}
		*/
		
		if(br.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(br.equals("edge")){
			driver = new EdgeDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		 
		
	}
	
	@Test(priority=1)
	void testLogo() {
		
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		Assert.assertEquals(status, true);
		
	}
	
	@Test(priority=2)
	void testTitle() {
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@Test(priority=3)
	void testUrl() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@AfterClass(alwaysRun=true)
	void teardown() {
		driver.quit();
		
	}

}
