package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		List<WebElement> d = driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames: "+d.size());
		
		for(int i=0;i<d.size();i++)
		{
			System.out.println(d.get(i).getAttribute("name"));
		}
        // driver.findElement(By.xpath("//*[id='Single']//iframe"));
		 // WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	     driver.findElement(By.xpath("//iframe[@id='singleframe']"));
         driver.switchTo().frame(0);
         driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("samreen");
		 //Thread.sleep(3000);
         
         
	}

}
