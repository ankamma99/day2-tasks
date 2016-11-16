package Crashcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2task2 extends Day2Task
{
	
	@Test
	public void invalidRegistration()
	{
		getDriver().findElement(By.id("u_0_1")).sendKeys("ankamma");
		getDriver().findElement(By.id("u_0_3")).sendKeys("rao");
		getDriver().findElement(By.id("u_0_5")).sendKeys("123456");
		getDriver().findElement(By.id("u_0_8")).sendKeys("56789");
		getDriver().findElement(By.id("u_0_a")).sendKeys("546564656");
		
		Select dropdown=new Select(getDriver().findElement(By.id("month")));
		dropdown.selectByVisibleText("Jun");
		
		Select dropdown1=new Select(getDriver().findElement(By.id("day")));
		dropdown1.selectByValue("6");
		
		Select dropdown2=new Select(getDriver().findElement(By.id("year")));
		dropdown2.selectByValue("1992");
		getDriver().findElement(By.id("u_0_i")).click();
		getDriver().findElement(By.id("u_0_e")).click();
		
	}
	
	
	@Test
	public void verify()
	{
		String actualresult=getDriver().findElement(By.xpath(".//*[@class='_5633 _5634 _53ij' and text()='Please enter a valid mobile number or email address.']")).getText();
		String expectedresult=("Please enter a valid mobile number or email address.");
		Assert.assertEquals(actualresult,expectedresult);
		
		
		
	}
		

}
