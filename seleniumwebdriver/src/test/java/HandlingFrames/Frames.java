package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
	/*	//frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='TANDJ.html']"));
		driver.switchTo().frame(frame1);
		boolean D=driver.findElement(By.xpath("//img[@src='C:\\My Personal\\Batches\\Selenium Elements\\TomandJerry.jpg']")).isDisplayed();
		System.out.println(D);
		driver.switchTo().defaultContent();
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='TR.html']"));
		driver.switchTo().frame(frame2);
		boolean A=driver.findElement(By.xpath("//img[@src='C:\\My Personal\\Batches\\Selenium Elements\\The Rock.jpg']")).isDisplayed();
		System.out.println(A);
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='Hyper links.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//a[@href='https://wallpapers.com/images/high/tom-and-jerry-cute-hugging-a7tvivlhjyyhc8r8.webp\']")).click();
		driver.switchTo().defaultContent();   */
		
		
		//Frame 1
		WebElement frame1=driver.findElement(By.xpath("//*[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		
		//Frame 2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("Rocket");
		driver.switchTo().defaultContent();
		
		//Frame 3
		WebElement frame3=driver.findElement(By.xpath("//*[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("java");

		//Inner iframe
		WebElement inner=driver.findElement(By.xpath("//*[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(inner);
		driver.findElement(By.xpath("//*[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		
		//Frame 4
		WebElement frame4=driver.findElement(By.xpath("//*[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//*[@name='mytext4']")).sendKeys("Coding");
		driver.switchTo().defaultContent();
		
		//Frame 5
		WebElement frame5=driver.findElement(By.xpath("//*[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//*[@href='https://a9t9.com']")).click();
		
	}

}
