import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///X:/@QSPIDERS/Selenium/HTML/webTable.html");
		List<WebElement> alltrs=driver.findElements(By.tagName("tr"));
		System.out.println("Total rows on webpage: "+alltrs.size());
		
		WebElement table2=driver.findElement(By.id("t2"));
		List<WebElement> table2Rows= table2.findElements(By.tagName("tr"));
		System.out.println("table 2 rows: "+table2Rows.size());
		
		driver.findElement(By.xpath(""));
		
		

	}

}
