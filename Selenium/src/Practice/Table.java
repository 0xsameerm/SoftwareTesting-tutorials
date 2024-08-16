package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/dynamicgrid.xhtml");
		
		//Columns count
		List<WebElement> columns =driver.findElements(By.tagName("th"));
		int colcount = columns.size();
		System.out.println(colcount);
		
		//Rows count
		List<WebElement> rows =driver.findElements(By.tagName("tr"));
		int rowcount = rows.size();
		System.out.println(rowcount);
		
	}

}
