package locators;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locatorsss {
		public static void main(String args[]) 
		{
			
			//AMAZON WEBSITE
		/*WebDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("captchacharacters")).sendKeys("TNLBPP");					//id locator
			//driver.findElement(By.name("field-keywords")).isDisplayed();						//name locator
			if(driver.findElement(By.name("field-keywords")).isDisplayed())						//name locator
			{
				System.out.println("true");
			}
			driver.quit(); */
			
			
//**********************************************************************************************************
			//YOUTUBE WEBSITE
			/*	WebDriver driver= new ChromeDriver();
			driver.get("https://www.youtube.com");
			driver.manage().window().maximize();		
			driver.findElement(By.name("search_query")).sendKeys("Themes");				//name locator
			driver.findElement(By.id("start")).isDisplayed();							//id
			System.out.println("Displayed");                                     
			driver.findElement(By.linkText("Shorts")).click();							//Linked text
			driver.findElement(By.partialLinkText("Shorts")).click();					//partial link text
			List<WebElement> youtubeLinks =driver.findElements(By.className("masthead-finish"));	//class name
			System.out.println("size " +youtubeLinks.size());
			List<WebElement> Links=driver.findElements(By.tagName("h3"));				//tag  name
			System.out.println("size " +Links.size());
			List<WebElement> links=driver.findElements(By.tagName("img"));
			System.out.println("size " +links.size());
			driver.quit();
			*/
			
//**********************************************************************************************************		
		    //DEMOBLAZE WEBSITE
			/*WebDriver driver=new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("exampleModal")).isDisplayed();
			System.out.println("Displayed");
			driver.findElement(By.linkText("Contact")).click();
			List<WebElement> links= driver.findElements(By.className("nav-item"));
			System.out.println("Links "+links.size());
			List<WebElement> img=driver.findElements(By.tagName("img"));
			System.out.println("img "+img.size());
			driver.quit();
			*/
//**********************************************************************************************************		
			//ERP24K WEBSITE
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.erp24k.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("kt_body")).isDisplayed();
			System.out.println("Displayed");
			driver.findElement(By.linkText("Get started")).click();
			driver.findElement(By.linkText("Login")).click();
			List<WebElement> links= driver.findElements(By.className("ng-star-inserted"));
			System.out.println("Links "+links.size());
			List<WebElement> img=driver.findElements(By.tagName("img"));
			System.out.println("img "+img.size());
			driver.quit();			
		}
}
