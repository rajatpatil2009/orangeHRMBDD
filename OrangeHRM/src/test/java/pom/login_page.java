package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.Login;
import test.E2E;

public class login_page 
{

	
	static WebElement  element = null;
	
	
	
	public static  WebElement  username()
	{
		element = Login.driver.findElement(By.cssSelector("input#txtUsername"));
		return element;
		
	}
	public static WebElement  passowrd()
	{
		element = Login.driver.findElement(By.cssSelector("input#txtPassword"));
		return element;
		
	}
	public static WebElement  submit()
	{
		element =Login.driver.findElement(By.cssSelector("input#btnLogin"));
		return element;
		
	}
	public static  WebElement  username1()
	{
		element = Login.driver.findElement(By.cssSelector("input#txtUsername"));
		return element;
		
	}
}
