package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Frames.html");
		 //driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		 driver.findElement(By.xpath("//div[@class='row']"));
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("samreen");
		 Thread.sleep(3000);
		// driver.navigate().back();

	}

}
