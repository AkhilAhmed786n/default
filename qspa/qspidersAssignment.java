package qspa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class qspidersAssignment  {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 driver.findElement(By.name("q")).sendKeys("qspiders");
	 Thread.sleep(4000);
	 List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	 Thread.sleep(4000);
	 System.out.println(allOptions.size());
	 for(int i=0;i<=allOptions.size()-1;i++) 
	 {
		 String text=allOptions.get(i).getText();
		 System.out.println(text);
		 }
	 for(int i=0;i<=allOptions.size()-1;i++)
	 {
		 if(allOptions.get(i).getText().equals("qspiders logo")) 
		 {
			 System.out.println("qspiders fees is 36000");
			 allOptions.get(i).click();
		 }
	 }
	}
}