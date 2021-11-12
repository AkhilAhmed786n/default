import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class handlingHiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 "
				+ "c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
		Thread.sleep(3000);
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		rwd.executeScript("window.scrollBy(0,1000)");
//		WebElement c=driver.findElement(By.xpath("//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top' and text()='28']/ancestor::div[contains(@aria-label,'Oct')]"));
//				c.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 "
//				+ "c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
		WebElement d=driver.findElement(By.xpath("//*[local-name()='svg' and @class='c-pointer c-secondary-500' and @data-testid='rightArrow']"));
		d.click();
		Thread.sleep(3000);
		d.click();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top' and"
				+ " text()='28']/ancestor::div[contains(@aria-label,'Dec')]"));
		e.click();
		
	}
}