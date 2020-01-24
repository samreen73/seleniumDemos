package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Frames.html");
		 driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		 driver.findElement(By.xpath("//div[@class='row']")).click();
		 driver.switchTo().frame(1);
		// driver.findElement(By.xpath("//div[contains(@class,'nav nav-tabs')]")).click();
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("samreen");
		 driver.switchTo().defaultContent();
		 
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();

	}

}
