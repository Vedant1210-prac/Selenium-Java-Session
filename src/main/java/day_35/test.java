package day_35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class test {
	
	static void DragAndDrop(WebDriver driver, WebElement source_dummy, WebElement target_dummy) {
		
		//WebElement source_dummy1;
		//WebElement target_dummy1;
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source_dummy, target_dummy).perform();
	}

}
