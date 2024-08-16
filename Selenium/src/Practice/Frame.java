package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.id("Click"));
		button.click();		
		
		String btntext = button.getText();
		System.out.println(btntext);
		
		driver.switchTo().defaultContent();
		
		//Count of frames
		List<WebElement> framescount = driver.findElements(By.tagName("iframe"));
		int size = framescount.size();
		System.out.println(size);
		
	}

}
