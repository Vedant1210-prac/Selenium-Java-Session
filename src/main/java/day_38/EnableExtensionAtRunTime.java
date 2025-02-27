package day_38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRunTime {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		
		File file = new File("C:\\Users\\VEBHURE\\Downloads\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx");
		option.addExtensions(file);

		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://text-compare.com/");
	}

}
