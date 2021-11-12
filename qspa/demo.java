package qspa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("butta bomma song");
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
		driver.findElement(By.xpath("//a[@id='video-title' and @class='yt-simple-endpoint style-scope ytd-video-renderer' and @href='/watch?v=2mDCVzruYzQ']")).click();
		
	}

}
