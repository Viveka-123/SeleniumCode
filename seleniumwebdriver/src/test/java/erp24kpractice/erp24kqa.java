package erp24kpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class erp24kqa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erpqa.azurewebsites.net/auth/login");
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys("viveka1");
		driver.findElement(By.xpath("//*[@formcontrolname=\"password\"]")).sendKeys("password@123");
		driver.findElement(By.xpath("//*[@formcontrolname=\"captcha\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-kt-menu-trigger=\"click\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Settings\"]")).click();
		Thread.sleep(2000);    
		driver.findElement(By.xpath("//span[text()='Multi Branch']")).click();
		Thread.sleep(2000);  
	/*	boolean sear=driver.findElement(By.xpath("//*[@formcontrolname=\"branchId\"]")).isEnabled();
		System.out.println(sear);
		boolean switc=driver.findElement(By.xpath("//*[@role=\"switch\"]")).isSelected();
		System.out.println(switc); */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=' arrow_forward ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Edit']")).click();
		driver.quit();
	}

}
