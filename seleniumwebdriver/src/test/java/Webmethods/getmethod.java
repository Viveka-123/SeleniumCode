 package Webmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.erp24k.com/");
	//	Thread.sleep(10000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
	//	String w=driver.getWindowHandle();
	//	System.out.println(w);
		
		driver.findElement(By.linkText("Get started")).click();
		Thread.sleep(10000);
		Set<String> o=driver.getWindowHandles();
		System.out.println(o);
		driver.quit();
	}

}
