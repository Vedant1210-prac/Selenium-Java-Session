package day_47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
	
	WebDriver hdriver;
	@BeforeClass
	void setup() {
		
		hdriver = new ChromeDriver();
		
		hdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		hdriver.manage().window().maximize();
		
	}
	
	
	@Test
	void Login() {
		
		/*LoginPage Lp = new LoginPage(hdriver);
		Lp.setUsername("Admin");
		Lp.setPassword("admin123");
		Lp.click_On_LoginBtn();*/
		
		LoginPage_New Ln = new LoginPage_New(hdriver);
		
		Ln.setUsername("Admin");
		Ln.setPassword("admin123");
		Ln.click_Btn();
		
		Assert.assertEquals(hdriver.getTitle(), "OrangeHRM");
	}
	
	
	@AfterClass
	void teardown() {
		
		hdriver.quit();
	}

}
