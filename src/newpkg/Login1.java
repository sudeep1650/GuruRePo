package newpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login1 {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
	//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
			
	String baseUrl = "http://demo.guru99.com/v4/";
	driver.get(baseUrl);
	
	WebElement email1 = driver.findElement(By.name("uid"));
	WebElement pwd1 = driver.findElement(By.name("password"));
	WebElement login1btn = driver.findElement(By.name("btnLogin"));
	login1btn.click();
	
	Alert alert = driver.switchTo().alert();					///*Alert popup Accepting*/
	alert.accept();
	
	System.out.println("Hello...1");
	WebElement email2 = driver.findElement(By.name("uid"));
	WebElement pwd2 = driver.findElement(By.name("password"));
	WebElement login2btn = driver.findElement(By.name("btnLogin"));
	
	email2.sendKeys("mngr156285");
	pwd2.sendKeys("pymUmut");
	
	System.out.println("Hello..2.");
	login2btn.click();
	Thread.sleep(2000);
	driver.close();
	
}
}
