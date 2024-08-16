package Practice;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.List;

import org.openqa.selenium.*;
public class Anchortags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	EdgeOptions options = new EdgeOptions();
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");
	
	WebDriver driver=new EdgeDriver(options);
	
	driver.get("https://www.flipkart.com");
	List<WebElement> listObj = driver.findElements(By.tagName("a"));
	for(WebElement ele:listObj) {
		System.out.println(ele.getText());
	}
	
	}

}
