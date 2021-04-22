package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.login_page;


public class E2E
{
	login_page login = new login_page();
	 public static  WebDriver driver= null;
  @Test
  public void f()
  {
	  
	  System.setProperty("webdriver.chrome.driver","H:\\Automation_setups\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  login.username().sendKeys("");
	  login.passowrd().sendKeys("");
	  
	  
	  
  }
}
