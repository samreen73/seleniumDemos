package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("samreen");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("shellimatti");
		//driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("mallamma nagar mudhol");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("hdgcdi123@gamil.com");
		//driver.findElement(By.xpath("//input[@class='form-control ng-touched ng-dirty ng-valid-parse ng-invalid ng-invalid-required']")).sendKeys("saamren@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("99011686");
	driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	//driver.findElement(By.xpath("@name='radiooptions' and @value='FeMale']"));
//driver.findElement(By.xpath("//label[2]//input[1]"));
driver.findElement(By.xpath("//input[@value='Movies']")).click();

//driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect-item']")).sendKeys("java");
//WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
WebElement d1 = driver.findElement(By.id("Skills"));
Select skill=new Select(d1);
List<WebElement> d = skill.getOptions();
System.out.println("number of skills: "+d.size());
for(int i=0;i<d.size();i++)
{
	System.out.println("name of skills are :"+d.get(i).getText());
	
}

//s1.selectByVisibleText("Java");

WebElement c1= driver.findElement(By.xpath("//select[@id='countries']"));
Select s2=new Select(c1);
s2.selectByVisibleText("India");

WebElement Year=driver.findElement(By.xpath("//select[@id='yearbox']"));
Select s=new Select(Year);
s.selectByVisibleText("1918");

WebElement Month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
Select s4=new Select(Month);
s4.selectByVisibleText("April");

WebElement Day=driver.findElement(By.xpath("//select[@id='daybox']"));
Select s5=new Select(Day);
s5.selectByVisibleText("1");





	
	
	}

}
