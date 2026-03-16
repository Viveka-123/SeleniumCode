package Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathaxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erpqa.azurewebsites.net/auth/login");
	//	driver.findElement(By.xpath("//input[@formcontrolname='email']/parent::div")).sendKeys("viveka1");
		driver.findElement(By.xpath("//input[@formcontrolname='email']/parent::div")).isDisplayed();
		System.out.println("Displayed");

	}

}
