package day_36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		WebElement min_Slider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		
		Point point_mid_Slider = min_Slider.getLocation();
		
		System.out.println("Location of min Slider " +point_mid_Slider);
		
		System.out.println("Location my X axis " +point_mid_Slider.getX());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min_Slider, 120, 126).perform();
				
		System.out.println("Location of min Slider after moving " +point_mid_Slider);
		
		WebElement max_Slider = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		
		Point point_max_slider = max_Slider.getLocation();
		
		System.out.println("Current Location of max slider" +point_max_slider);
		
		System.out.println("Location of X axis  " +point_max_slider.getX());
		
		act.dragAndDropBy(max_Slider, -200, 126).perform();
		
		System.out.println("Current location of max slider after sliding "  +max_Slider.getLocation());
		
		
		
		
	}

}
