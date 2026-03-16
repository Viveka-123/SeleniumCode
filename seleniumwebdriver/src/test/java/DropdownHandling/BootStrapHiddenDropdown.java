package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrapHiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erpqa.azurewebsites.net/auth/login");
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys("viveka1");
		driver.findElement(By.xpath("//*[@formcontrolname=\"password\"]")).sendKeys("password@123");
		driver.findElement(By.xpath("//*[@formcontrolname=\"captcha\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sales']")).click();
		Thread.sleep(2000);
		// Wait and click input
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Wait and click input
		WebElement input = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//input[@placeholder='Search for a customer']")
		        ));
		input.click();	//	Thread.sleep(5000);

		// Wait for dropdown option and click first one
	    WebElement option = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("(//mat-option)[1]")
		        ));
		option.click();		
	//	driver.findElement(By.xpath("//span[contains(text(),'aaaa')]")).click(); 
		
    	List<WebElement> options=driver.findElements(By.xpath("//mat-option//span[@class='mat-option-text']"));
		System.out.println(options.size());
		Thread.sleep(2000);    
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		*/
//Practice-----------------------------------------------
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement  color=driver.findElement(By.xpath("//*[@id='colors']"));
		Select c=new Select(color);
	//	c.selectByIndex(0);
		List<WebElement> options=c.getOptions();
		System.out.println(options.size());
		for(WebElement op:options)
		{
			System.out.println(op.getText());
			String colo=op.getText();
			{
					if(colo.equals("Red")||colo.equals("Blue")) {
					op.click();
					}
			}
		}
				
	}		
}

