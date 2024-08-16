package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/input.xhtml");

//Entering the name in the TextBox
		driver.findElement(By.id("j_idt88:name")).sendKeys("sameer");
		Thread.sleep(3000);
//Using xpath locator appending the text in textbox
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("India");
//retrieve the typed text
		String value = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(value);
//clearing the text
		WebElement Clearbox = driver.findElement(By.id("j_idt88:j_idt95"));
		Clearbox.clear();

//driver.close();
	}

}
