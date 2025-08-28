package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//driver.quit();
		//driver.close();
	}
	

}
