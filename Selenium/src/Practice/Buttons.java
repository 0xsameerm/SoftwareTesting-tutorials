package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement button = driver.findElement(By.id("j_idt88:j_idt90"));
		button.click();
		
		driver.navigate().back();
		
		//Get button position
		WebElement posbutton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point position = posbutton.getLocation();
		int xvalue = position.getX();
		int yvalue = position.getY();
		System.out.println("X value is "+xvalue+"Y value is "+yvalue);
		
		//Get button color
		WebElement colorbtn = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = colorbtn.getCssValue("color");
		System.out.println(color);
		
		//Get button height and width
		WebElement btnsize = driver.findElement(By.id("j_idt88:j_idt96"));
		int height = btnsize.getSize().getHeight();
		int width = btnsize.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		
		//driver.close();
	}

}
