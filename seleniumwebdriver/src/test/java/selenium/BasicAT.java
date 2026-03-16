package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class BasicAT {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();//
		//WebDriver driver=new ChromeDriver();
	/*	driver.get("https://www.erp24k.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		String act_title=driver.getTitle();
		if(act_title.equals("ERP24K: Advanced ERP Jewellery Software for Retail Stores"))
				{
				System.out.println("test passed");
				}
		else
		{
			System.out.println("test failed");
		}
		driver.quit();
//******************************************************************************************
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		String act_title=driver.getTitle(); 
		if(act_title.equals("OpenCart - Demo"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.quit();
		//driver.close();  
		
//******************************************************************************************	
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		String act_title=driver.getTitle(); 
		if(act_title.equals("OpenCart - Demo"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.quit();
		//driver.close(); */
		
//******************************************************************************************	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getikk.com/");
		
		driver.getTitle();
		String act_title=driver.getTitle();
		if(act_title.equals("Getikk"))
				{
					System.out.println("Test Passed");
				}
		else {
			System.out.println("Test Failed");
		}
		driver.quit();
	}

}
