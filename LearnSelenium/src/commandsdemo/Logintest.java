package commandsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class Logintest {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");

	}

}
