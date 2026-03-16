package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KekaXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://app.keka.com/Account/KekaLogin?returnUrl=%2Fconnect%2"
				+ "Fauthorize%2Fcallback%3Fresponse_type%3Dcode%26client_id%3D987"
				+ "cc971-fc22-4454-99f9-16c078fa7ff6%26state%3DTGhuMFl6bGF6MHZQMj"
				+ "EuaHRNczVDUVc5Mm11ZWpULUl0M0lQUlJET3RxeF83%26redirect_uri%3Dhtt"
				+ "ps%253A%252F%252Fcixcent.keka.com%26scope%3Dopenid%2520offline_a"
				+ "ccess%2520kekahr.api%2520hiro.api%26code_challenge%3DwPQOybGvPI8n"
				+ "Y_4sggVLVWhTlf_bbeNMg7CCfdTaQ-Y%26code_challenge_method%3DS256%26nonce%3"
				+ "DTGhuMFl6bGF6MHZQMjEuaHRNczVDUVc5Mm11ZWpULUl0M0lQUlJET3RxeF83");
		driver.manage().window().maximize();
	/*	driver.findElement(By.xpath("//input[@type='text'][@id='email']")).sendKeys("chitakula@cixcent.com");		
		driver.findElement(By.xpath("//input[@type='password'][@id='password']")).sendKeys("Viveka@2020");
		
		driver.findElement(By.xpath("//input[@type='text'and @id='email']")).sendKeys("chitakula@cixcent.com");		
		driver.findElement(By.xpath("//input[@type='password'and @id='password']")).sendKeys("Viveka@2020");
		
		driver.findElement(By.xpath("//input[@type='text'or @id='email']")).sendKeys("chitakula@cixcent.com");		
		driver.findElement(By.xpath("//input[@type='password'or @id='password']")).sendKeys("Viveka@2020");
		
		boolean status=driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("chitakula@cixcent.com");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Ema')]")).sendKeys("ashgjklm;");  */
		
		boolean status=driver.findElement(By.xpath("//div[@class='d-lex vh-100']/div/img")).isDisplayed();
		System.out.println("true");
	//	Thread.sleep(2000);
	//	driver.quit();
	}

}
