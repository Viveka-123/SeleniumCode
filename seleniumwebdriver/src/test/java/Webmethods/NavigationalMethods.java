package Webmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.erp24k.com/");
		driver.get("https://www.youtube.com/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();;
		
	}

}
