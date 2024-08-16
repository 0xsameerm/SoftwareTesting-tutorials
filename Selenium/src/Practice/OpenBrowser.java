package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Setting the path of the EdgeDriver
		//No need to download driver and set path in Selenium4
		System.setProperty("webdriver.edge.driver", "C:\\Users\\abusm\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in");

		driver.findElement(By.name("q")).sendKeys("Messi"+Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
	}

}
