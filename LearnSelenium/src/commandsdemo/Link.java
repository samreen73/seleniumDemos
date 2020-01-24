package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args)
	{

System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
List<WebElement> list = driver.findElements(By.tagName("a"));
System.out.println("number of links :"+list.size());
for(int i=0;i<list.size();i++)
{
	System.out.println("name of links are"+list.get(i).getText());
}


	}

}

