package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rediff {
	WebDriver driver;
	
@Test(description="Lunch Rediff",priority=1)
public void openBrowser()
{
	System.out.println("Open Rediff");
	driver= new EdgeDriver();
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
	
}
// End openBrowser
@Test(description="Login",priority=2,enabled=false)


public void loginRediff() 
{
	System.out.println("Login");
	String title=driver.getTitle();
	System.out.println("Title:"+title);
	Assert.assertEquals(title,"Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");
	System.out.println("Assert Executes");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("login1")).sendKeys("Jack");
	driver.findElement(By.id("password")).sendKeys("Jack123");
	
	String chRemstatus=driver.findElement(By.id("remember")).getAttribute("checked");
	if(chRemstatus.equals("checked"))
	{
		driver.findElement(By.id("remember")).click();
		
	}

	
}
@Test(description="Login",priority=2) // Soft assert


public void loginRediff1() 
{
	SoftAssert assertion=new SoftAssert();
	
	System.out.println("Login");
	String title=driver.getTitle();
	System.out.println("Title:"+title);
	assertion.assertEquals(title,"Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");
	System.out.println("Assert Executes");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("login1")).sendKeys("Jack");
	driver.findElement(By.id("password")).sendKeys("Jack123");
	
	String chRemstatus=driver.findElement(By.id("remember")).getAttribute("checked");
	if(chRemstatus.equals("checked"))
	{
		driver.findElement(By.id("remember")).click();
		
	}
	assertion.assertAll();
	
}



// End login Rediff

@Test(description="close browser",priority=3)

public void closeBrowser() 
{
	System.out.println("Close Rediff");
	driver.quit();
}
// End close browser



}
