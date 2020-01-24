package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/computers");
		//driver.get("http://demo.automationtesting.in/login.html");
		//driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Registe')]"));
		driver.findElement(By.xpath("//a[contains(text(),'Computers')]//ancestor::ul//child::li//a[contains(text(),'Electronics')]")).click();
		
		
	}

}
