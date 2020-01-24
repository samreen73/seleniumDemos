package commandsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
Alert a = driver.switchTo().alert();
String alt1 = a.getText();
System.out.println("Alert title is "+alt1);
Thread.sleep(3000);
a.accept();
driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Alert a2 = driver.switchTo().alert();
String altx = a2.getText();
System.out.println("Alert title is "+altx);
Thread.sleep(3000);
a2.dismiss();
driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
Alert a3 = driver.switchTo().alert();
a3.sendKeys("samreen");
String altxx = a2.getText();
System.out.println("Alert title is "+altxx);
Thread.sleep(3000);
a3.accept();









	}

}
