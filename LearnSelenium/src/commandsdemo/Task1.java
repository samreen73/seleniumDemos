package commandsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	String title=driver.getTitle();
	int length=driver.getTitle().length();
	System.out.println(title);
	System.out.println(length);
	String url1="http://demowebshop.tricentis.com/";
	String url=driver.getCurrentUrl();
	if(url1.equals(url))
	{
		System.out.println("u are  in correct page");
		
	}
	else
	{
		System.out.println("incorrct");
	}
	System.out.println(url);
	String source=driver.getPageSource();
	int length1=driver.getPageSource().length();
	System.out.println(length1);
	

	}

}
