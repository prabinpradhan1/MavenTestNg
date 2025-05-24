package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	WebDriver driver;
	
	@Test
	public void pickdate() throws InterruptedException{
		
		Integer yr=2026;
		driver= new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		while(true) {
			String year=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			System.out.println("month="+month+"\t"+"year="+year);
			
			if(year.equals(String.valueOf(yr)) && month.equals("May"))
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
				break;	
			}
			if(yr<=2025)
			
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
				
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
			
			
			
		}
		
		
		Thread.sleep(4000);

		driver.quit();
		
	}
}
