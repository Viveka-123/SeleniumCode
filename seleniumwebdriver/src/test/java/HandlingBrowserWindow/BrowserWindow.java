package HandlingBrowserWindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	WebDriver driver=new ChromeDriver();
		driver.get("https://www.erp24k.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Get started']")).click();
		Set<String> windowID=driver.getWindowHandles();
		List<String> window= new ArrayList(windowID);
		
		String window1=window.get(0);
		String window2=window.get(1);
		
		driver.switchTo().window(window1);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		
		driver.quit();  
		
		//Closing of specific browser tabs
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.erp24k.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Get started']")).click();
		Set<String> window=driver.getWindowHandles();
		for(String w:window)
		{
			String title=driver.switchTo().window(w).getTitle();
			System.out.println(title);
			if(title.equals("ERP24K: Advanced ERP Jewellery Software for Retail Stores"));
			{
				driver.close();
			}
		} */
		
		//Closing of specific browser tabs
		WebDriver driver=new ChromeDriver();
		driver.get("https://id.atlassian.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"username-uid1\"]")).sendKeys("chitakula@cixcent.com");
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Nandana@2020");
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
	/*   driver.findElement(By.xpath("//*[text()='Get started']")).click();
		Set<String> window=driver.getWindowHandles();
		for(String w:window)
		{
			String title=driver.switchTo().window(w).getTitle();
			System.out.println(title);
			if(title.equals("ERP24K: Advanced ERP Jewellery Software for Retail Stores"));
			{
				driver.close();
			}
		} */
	}
}

