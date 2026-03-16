package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erpqa.azurewebsites.net/auth/login");
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys("viveka1");
		driver.findElement(By.xpath("//*[@formcontrolname=\"password\"]")).sendKeys("password@123");
		driver.findElement(By.xpath("//*[@formcontrolname=\"captcha\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"More\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Master\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Hall Mark\"]")).click();
	//	driver.findElement(By.xpath("//*[text()=\"Mask Code\"]")).click();
		Thread.sleep(2000);
	//	int head=driver.findElements(By.xpath("//*[@role='table']//thead//tr[1]")).size();
		int rows=driver.findElements(By.tagName("tr")).size();
		int cols=driver.findElements(By.tagName("th")).size();		
	//	System.out.println(rows); 
	//	System.out.println(cols);
		Thread.sleep(2000);
	//	String head=driver.findElement(By.xpath("//*[@role=\"table\"]//thead//tr[1]")).getText();
	//	System.out.print(head);
	//	System.out.println();
		Thread.sleep(2000);
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
			String rowt=driver.findElement(By.xpath("//*[@role='table']//tbody//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(rowt+"\t");
			}
			System.out.println();
		}
		
		
	/*	String rowt=driver.findElement(By.xpath("//*[@role='table']//tbody//tr[1]//td[2]")).getText();
		System.out.print(rowt);  */
	}

}
