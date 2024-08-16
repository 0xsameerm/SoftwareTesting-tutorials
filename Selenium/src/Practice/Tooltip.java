package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/tool-tips");
		
		WebElement tooltip = driver.findElement(By.id("toolTipButton"));
		
		Actions builder = new Actions(driver);
		//builder.contextClick(tooltip);
		
		builder.moveToElement(tooltip).perform();
		String msg = tooltip.getText();
		System.out.println(msg);
		
	}

}
