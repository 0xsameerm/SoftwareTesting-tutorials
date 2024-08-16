package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for(WebElement ele:options) {
			System.out.println(ele.getText());
		}
		
	}

}
