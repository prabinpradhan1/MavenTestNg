package testScenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwitchingWindow {
 WebDriver driver;
	
	
	@Test
	public void switchWin()
	{
		driver= new EdgeDriver();
		driver.get("https://www.w3schools.com/Jsref/tryit.asp?filename=tryjsref_win_open");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("Number of windows="+allWinIds.size());
		String win1=null;
		String win2=null;
		Iterator<String>itr=allWinIds.iterator();
		if(itr.hasNext()) {
			
			win1=itr.next();
			win2=itr.next();
			
		}
		System.out.println(win1);
		System.out.println(win2);
		System.out.println("Window Title:"+driver.getTitle());
		driver.switchTo().window(win2);
		
		System.out.println("Window2 Title:"+driver.getTitle());
		boolean chkloginstat=driver.findElement(By.id("tnb-login-btn")).isEnabled();
		System.out.println(chkloginstat);
		if(chkloginstat=true)
		{
			System.out.println("Login Button Enabled..");
		}
		else
		{
			System.out.println("Login Button Disabled...");
		}
		driver.quit();
			
	}

	


}
