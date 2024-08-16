package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		
		WebElement dashboardLink = driver.findElement(By.linkText("Go to Dashboard"));
		dashboardLink.click();
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WebElement link2 = driver.findElement(By.partialLinkText("Find the URL"));
		link2.click();
		
		System.out.println(driver.getTitle());
		}

}
