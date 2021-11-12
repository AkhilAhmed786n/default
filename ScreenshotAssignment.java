import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotAssignment {
	public static void main (String []args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://yuvadhwaja.in/initiatives.html");
		 Thread.sleep(6000);
		 
		 RemoteWebDriver rwd=(RemoteWebDriver)driver;
		 File src=rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("X:\\screenrecorderpc\\selinium\\screenshot1assignment.png");
		Files.copy(src, dest);
		
//		WebElement a = driver.findElement(By.xpath("//img[@src='images/flood_relief_UK.jpg']"));
//		a.getLocation()
	
	}
}