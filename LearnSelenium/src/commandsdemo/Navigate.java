
package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{

	public static void main(String[] args) throws InterruptedException
	{

System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://demowebshop.tricentis.com/");
driver.findElement(By.xpath("//a[@class='ico-register']")).click();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().to("http://demowebshop.tricentis.com/");
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.close();


	}

}
