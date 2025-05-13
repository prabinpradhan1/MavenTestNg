package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
	WebDriver driver;
	
	@Test(priority=1)
	public void dragDrop() throws InterruptedException {
		driver= new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		//action.dragAndDrop(drag, drop).build().perform();
		action.clickAndHold(drag).moveToElement(drop).build().perform();
		Thread.sleep(4000);
		driver.quit();	
		
	}
	@Test(priority=2)
	public void reSize() throws InterruptedException {
		driver= new EdgeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);	
		WebElement reSz=driver.findElement(By.id("resizable"));
		Actions action=new Actions(driver);
		action.clickAndHold(reSz).moveByOffset(450, 200).release().perform();
		Thread.sleep(4000);
		driver.quit();
	}
	
	


}
