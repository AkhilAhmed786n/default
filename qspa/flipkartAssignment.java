package qspa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkartAssignment {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 WebElement a=driver.findElement(By.name("q"));
	 a.sendKeys("laptops");
	 Thread.sleep(3000);
	 a.sendKeys(Keys.DOWN);
	 a.sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
	WebElement b = driver.findElement(By.xpath("//select[@class='_2YxCDZ']/ancestor::div[@class='_3uDYxP']/descendant::option[@value='50000']"));
	b.click();
	Thread.sleep(3000);
//	Select sel=new Select(b);
//	sel.selectByValue("50000");
	
	
	
	WebElement c=driver.findElement(By.xpath("//div[text()='Core i3' and @class='_3879cV']"));
	c.click();
	Thread.sleep(4000);
	WebElement d=driver.findElement(By.xpath("//div[text()='Processor']"));
	d.click();
	Thread.sleep(4000);
	WebElement e=driver.findElement(By.xpath("//div[text()='Brand']"));
	e.click();
	
	
	WebElement f=driver.findElement(By.xpath("//div[text()='DELL' and @class='_3879cV']"));
	f.click();
	
	
	}
}