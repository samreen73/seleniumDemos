package commandsdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {

	public static void main(String[] args)
	{
		Logger log=Logger.getLogger(Log4jdemo.class);
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 log.info("Application started successfully");
		 
		 String expectedtitle ="google";
		 String actualtitle = driver.getTitle();
		 log.warn("check title");
		 if(expectedtitle.equals(actualtitle))
		 {
			 System.out.println("correct title");
			 log.info("correct title");
			 driver.close();
		 }
		 else
		 {
			 System.out.println("incorrect title");
			 log.warn("incorrect title");
			 
		 }

	}

}
