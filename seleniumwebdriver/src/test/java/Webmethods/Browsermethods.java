package Webmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.erp24k.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Get started']")).click();
		Thread.sleep(2000);
	//	driver.close();     //Closes the first tab 
		driver.quit();		//quit from entire url, sub tabs
	}

}
