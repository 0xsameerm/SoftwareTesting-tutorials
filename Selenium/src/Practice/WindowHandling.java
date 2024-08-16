package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldwindow=driver.getWindowHandle();
		WebElement btn = driver.findElement(By.id("j_idt88:new"));
		btn.click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String newWindow:handles) {
			driver.switchTo().window(newWindow);
		}
		System.out.println(driver.getTitle());
		//driver.close();
		
	}

}
