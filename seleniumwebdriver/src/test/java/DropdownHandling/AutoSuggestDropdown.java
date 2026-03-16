package DropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://www.google.com/?zx=1771852161903&no_sw_cr=1");
		driver.findElement(By.xpath("//*[@role='combobox']")).sendKeys("linkedin");
		Thread.sleep(5000);
		List<WebElement> opt=driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
		System.out.println(opt.size());
       int i=1;
		for(WebElement op:opt)
		{
			System.out.println((i)+"."+op.getText());
			i++;
		}
		driver.findElement(By.xpath("//div[@id='gLuoSb']//div[1]//span[1]")).click();
		   
		   */
		driver.get("https://www.google.com/?zx=1771852161903&no_sw_cr=1");
		driver.findElement(By.xpath("//*[@role='combobox']")).sendKeys("Selenium");
		Thread.sleep(10000);
		List<WebElement> opt=driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
		System.out.println(opt.size());
		for(WebElement o:opt)
		{
			System.out.println(o.getText());
		}
		driver.findElement(By.xpath("//div[@id='jZ2SBf']//div[1]//span[1]")).click();
	}

}
