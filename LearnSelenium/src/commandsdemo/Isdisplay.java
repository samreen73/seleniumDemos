package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplay {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		boolean checkpresent = driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresent);
		boolean checkenble= driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenble);
		if(checkpresent==true && checkenble==true)
		{
			driver.findElement(By.id("Email")).sendKeys("samreen@gmail.com");
		}
		else
		{
			System.out.println("not presnet");
		}
		

	}

}
