package Crashcourse;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day2task3 extends Day2Task
{
	
	@Test
	public void month()
	{
		Select dropdown=new Select(getDriver().findElement(By.id("month")));
		List<WebElement> list=dropdown.getOptions();
		
		boolean duplicate=false;
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=1;j<list.size();j++)
			{
				if(list.get(i).getText()==list.get(j).getText())
				{
					System.out.println("duplicate values are:"+"  "+list.get(i).getText() + list.get(j).getText());
					duplicate=true;
					break;
				}
			}
			
			
		}
		if(duplicate==false)
		{
			System.out.println("no duplicate values are found in the month");
		}
		
		
		
	}
	@Test
	public void day()
	{
		Select  dropdown1=new Select(getDriver().findElement(By.id("day")));
		List<WebElement> list=dropdown1.getOptions();
		
		boolean duplicate=false;
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=1;j<list.size();j++)
			{
				if(list.get(i).getText()==list.get(j).getText())
				{
					System.out.println("duplicate values are:"+" "+list.get(i).getText() + list.get(j).getText());
				}
			}
		}
		if(duplicate==false)
		{
			System.out.println("no duplicate valuess in day");
		}
		
		
	}
	@Test
	public void year()
	{
		Select dropdown2=new Select(getDriver().findElement(By.id("year")));
		List<WebElement> list=dropdown2.getOptions();
		
		boolean duplicate=false;
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=1;j<list.size();j++)
			{
				if(list.get(i).getText()==list.get(j).getText())
				{
					System.out.println("the duplicate values are :"+ " "+list.get(i).getText() + list.get(j).getText());
				}
			}
		}
		if(duplicate==false)
		{
			System.out.println("no duplicate values in year");
		}
		
	}

}
