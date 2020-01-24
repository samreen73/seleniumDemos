package Griddemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemoTest
{
	public WebDriver driver;
	
	@Test
	public void verifylogin() throws MalformedURLException 
	{
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);

		driver=new RemoteWebDriver(new URL("http://172.23.102.13:4455/wd/hub"),cap);
		driver.get("http://demowebshop.tricentis.com/login");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("samreen@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("samreen");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println("successfully loggeded in");
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

}
