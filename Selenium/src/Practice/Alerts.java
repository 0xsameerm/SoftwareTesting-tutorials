package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//To click ok in the alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//To click cancel in the alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
	}

}
