import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//span[@id='4']"));
		a.sendKeys("love");
		a.sendKeys(Keys.DOWN);
		a.sendKeys(Keys.ENTER);
		
		
		
		
	}
}