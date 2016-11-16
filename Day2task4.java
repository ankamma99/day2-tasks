package Crashcourse;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day2task4 extends Day2Task
{
	@Test
	public void maleButtton()
	{
		boolean isSelected;
		getDriver().findElement(By.id("u_0_i")).click();
		isSelected=getDriver().findElement(By.id("u_0_i")).isSelected();
		
		if(isSelected==true)
		{
			System.out.println("the male button is selected");
		}
		else
		{
			System.out.println("the male button is not selected");
		}
		
	}
	
	@Test
	public void femaleButton()
	{
		boolean Selected;
		getDriver().findElement(By.id("u_0_h")).click();
		Selected=getDriver().findElement(By.id("u_0_h")).isSelected();
		
		if(Selected==true)
		{
			System.out.println("the female button is selected");
		}
		else
		{
			System.out.println("the female button is not selected");
		}
		
		
	}

}
