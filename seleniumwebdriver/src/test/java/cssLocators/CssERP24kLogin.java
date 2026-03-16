package cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssERP24kLogin {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
	//	driver.get("https://erpqa.azurewebsites.net/schemes");
		driver.get("https://erpqa.azurewebsites.net/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Akanksha");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("password@123");
		driver.findElement(By.cssSelector("input[placeholder=\"Enter the CAPTCHA\"]")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	//	driver.close();  
	}

}
