package DropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
	/*	WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drp=driver.findElement(By.xpath("//*[@id='country']"));
		Select drpp=new Select(drp);
		//drpp.selectByIndex(2);
		//drpp.selectByValue("search-alias=fashion");
		//drpp.selectByVisibleText("Amazon Fresh Meat");
		List<WebElement> options=drpp.getOptions();
		System.out.println(options.size());
		Thread.sleep(2000);
	/*	for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		driver.close();    
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		     */
//Practice-----------------------------------------------
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement  country=driver.findElement(By.xpath("//*[@id='country-list']"));
		country.click();
		Select c=new Select(country);
		List<WebElement> options=c.getOptions();
		System.out.println(options.size());
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
	}

}
