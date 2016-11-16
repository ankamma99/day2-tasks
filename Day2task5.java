package Crashcourse;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day2task5 extends Day2Task
{
	@Test
	public void button()
	{
		
		boolean isEnabled=getDriver().findElement(By.id("u_0_i")).isEnabled();
		if(isEnabled==true)
		{
			System.out.println("dont click both the buttons");
		}
		else
		{
			System.out.println("click on male button");
		}
	}

}
