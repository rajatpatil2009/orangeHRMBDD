package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import  pom.login_page;



public class Login 
{
	 
	 public static  WebDriver driver= null;

	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		  System.setProperty("webdriver.chrome.driver","H:\\Automation_setups\\chromedriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enter username which is {string}")
	public void user_enter_username_which_is(String username) {
		login_page.username().sendKeys(username);
	}

	@When("user enter password which is {string}")
	public void user_enter_password_which_is(String password) {
		login_page.passowrd().sendKeys(password);
	}

	@When("user click on submit button")
	public static void user_click_on_submit_button() 
	{
		login_page.submit().click();
	}

	@Then("user is on home page")
	public static void user_is_on_home_page()
	{
	   String actulapagetiltle =  "OrangeHRM";
	   Assert.assertEquals(actulapagetiltle, driver.getTitle());
	   
	}
	
	
}
