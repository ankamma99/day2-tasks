package Crashcourse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Day2Task
{
	
	private static WebDriver driver=null;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@BeforeClass
	
	public void beforeClass()  
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
		
			
			
	

}
