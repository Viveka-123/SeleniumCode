package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erpqa.azurewebsites.net/auth/login");
		
	/*	*****Xpath with Single attribute*****
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("guyguy");
		
		*****Xpath with Multiple attribute*****
		driver.findElement(By.xpath("//input[@type='text'][@autocomplete='off']")).sendKeys("Viveka1");	
		
		*****Xpath with 'and' 'or' Operators*****
		driver.findElement(By.xpath("//input[@type='text' and @autocomplete='off']")).sendKeys("45612");
		driver.findElement(By.xpath("//input[@type='text' or @autocomplete='off']")).sendKeys("fgdgdf");
		
		*****Xpath with Inner text-text()***** 
		boolean displaystatus= driver.findElement(By.xpath("//label[text()='User Name']")).isDisplayed();
		System.out.println(displaystatus);
		String value= driver.findElement(By.xpath("//label[text()='User Name']")).getText();
		System.out.println(value);         
		
		*****Xpath with Inner //*[text(),'value')]-(.)***** 
		boolean displaystatus= driver.findElement(By.xpath("//label[.='User Name']")).isDisplayed();
		System.out.println(displaystatus);          
		
		boolean displaystatus= driver.findElement(By.xpath("//h1[.='Sign In']")).isDisplayed();
		System.out.println(displaystatus);           
		
		*****Xpath with Contains--//*[contains(@attribute, 'Value')]*****        
		driver.findElement(By.xpath("//*[contains(@formcontrolname,'e')]")).sendKeys("viveka1");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password@123");
	//	Thread.sleep(2000);            
		
	//	*****Xpath with starts-with--//*[starts-with(@attribute, 'Value')]*****         
		driver.findElement(By.xpath("//*[starts-with(@formcontrolname,'cap')]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	//	Thread.sleep(2000);            
		driver.findElement(By.xpath("//span[text()='Estimation']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='barcodeNumber']")).sendKeys("1014");

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='barcodeNumber']"))).sendKeys("1014");
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
	//	Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@type='button']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Enter Weight Barcode Number' and @formcontrolname='barcodeNumber']")).sendKeys("1014");
		
	/*	*****Xpath with Chained---//[(@attribute='Value')]/a/div*****        
		boolean found=driver.findElement(By.xpath("//div[@class='d-flex justify-content-between mt-n5']/div/label")).isDisplayed();
		System.out.println(found);   
		Thread.sleep(5000);  
		driver.close();   */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erpqa.azurewebsites.net/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys("viveka1");
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("password@123");
		driver.findElement(By.xpath("//*[@formcontrolname='captcha']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[text()='Sales']")).click();
	//	driver.findElement(By.xpath("//*[@formcontrolname='customerName']"));
	//	driver.close();
		 
		
	}

}
