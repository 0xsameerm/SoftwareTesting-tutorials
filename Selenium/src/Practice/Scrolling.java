
package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.jqueryui.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll down by specific number of pixels
		js.executeScript("window.scrollBy(0,1000)");
		
		//Scroll to bottom of page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
