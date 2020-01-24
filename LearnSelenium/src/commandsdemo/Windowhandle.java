package commandsdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) 
	{


		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Windows.html");
		 String d = driver.getTitle();
		 System.out.println("the title of main window: "+d);
		WebElement d1 = driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		d1.click();
		Set<String> d2 = driver.getWindowHandles();
		Iterator<String> it = d2.iterator();
		String mainwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		 System.out.println("the title of child window: "+driver.getTitle());
		 driver.close();
		 driver.switchTo().window(mainwindow);
		 System.out.println("the title of child window: "+driver.getTitle());
		 driver.close();
		 
		

	}

}
