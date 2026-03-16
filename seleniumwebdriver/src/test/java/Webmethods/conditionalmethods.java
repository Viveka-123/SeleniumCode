package Webmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.erp24k.com/auth/signup");
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//is.Displayed()
		//Accessing through WebElement
	/*	WebElement reg=driver.findElement(By.xpath("//h1[text()='Register']"));
		System.out.println(reg.isDisplayed());
		
	    //Using Boolean Expression
		boolean display=driver.findElement(By.xpath("//h1[text()='Register']")).isDisplayed();
		System.out.println(display); */
		
		//is.Enabled
	//	boolean enable=driver.findElement(By.xpath("//*[@placeholder='Enter store name*']")).isEnabled();
	//	System.out.println(enable);
		
		WebElement male=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		male.click();
		System.out.println(male.isSelected());
		female.click();
		System.out.println(female.isSelected());
		
		
		//isSelected()
		boolean check=driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).isSelected();
		System.out.println(check);
		Thread.sleep(2000);
		driver.quit();
	}

}
