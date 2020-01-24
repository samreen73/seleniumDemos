package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//System.setProperty("webdriver.gecko.driver","E:\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
	//WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("samreen@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("samreen");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expectedname="Demowebsite";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		if(expectedname.equals(actualname))
		{
			System.out.println("u are  in correct page");
			
		}
		else
		{
			System.out.println("incorrct");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.close();
		

	}

}
