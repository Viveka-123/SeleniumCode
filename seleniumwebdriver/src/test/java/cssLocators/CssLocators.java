package cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.erp24k.com/");
		
		//tag id      tag#id---------(Syntax)
	    driver.findElement(By.cssSelector("input#mat-input-3")).sendKeys("viveka@gmail.com");
		driver.findElement(By.cssSelector("#mat-input-3")).sendKeys("mail");   //we can remove tag name
		
		//tag class     tag.class--------(Syntax)
		driver.findElement(By.cssSelector("input.mat-input-element ")).sendKeys("Nandana");
		driver.findElement(By.cssSelector(".mat-input-element ")).sendKeys("Viveka");
		
		//tag attribute     tag[attribute="value"]-----------(Syntax)
		driver.findElement(By.cssSelector("input[id='mat-input-0']")).sendKeys("Vivekaaaaaa");
		driver.findElement(By.cssSelector("[id='mat-input-0']")).sendKeys("Nandana");
		
		//tag class attribute      tag.class[attribute="value"]---------(Syntax)
	    driver.findElement(By.cssSelector("input.mat-input-element[id=\"mat-input-0\"]")).sendKeys("Meghnaa");
	    driver.findElement(By.cssSelector("input.mat-input-element[id=\"mat-input-1\"]")).sendKeys("4569781230");
	    driver.findElement(By.cssSelector("input.mat-input-element[id=\"mat-input-2\"]")).sendKeys("KAlpana Stores");
	    driver.findElement(By.cssSelector("input.mat-input-element[id=\"mat-input-3\"]")).sendKeys("www.google.com");
	    
	    //tag class attribute      tag.class---------(Syntax)
	    driver.findElement(By.cssSelector("button.btn text-white light_bg_color rounded-1 w-100")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
