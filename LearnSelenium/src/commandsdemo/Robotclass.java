package commandsdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		//driver.get("http://demo.automationtesting.in/Register.html");
		Robot r=new Robot();
		r.setAutoDelay(3000);
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		//driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		StringSelection strnslc=new StringSelection("C:\\Users\\IBM\\Downloads\\srs.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strnslc, null);
		r.setAutoDelay(3000);
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 r.setAutoDelay(3000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.close();
		 
		 
		 

	}

}
