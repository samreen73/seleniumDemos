package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.findElement(By.xpath("//a[@class='ico-register']")).click();
driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("samreen123");
driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("shellimatti123");
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyzxyz123@gmail.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcxz123");
driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("abcxz123");
driver.findElement(By.xpath("//input[@id='register-button']")).click();
//driver.close();

	

}
}