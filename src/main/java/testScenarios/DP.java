package testScenarios;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
	Object[][] data;
	
	@DataProvider(name="data")
	public Object[][] setdata()
	{
		data=new Object[3][2];
		data[0][0]="Jack";
		data[0][1]="jack123";
		
		data[1][0]="riya";
		data[1][1]="riya123";
		
		data[2][0]="puja";
		data[2][1]="puja123";
		
		return data;
	}
	@Test(dataProvider="data")
	public void login(String un,String Pw) {
		System.out.println(un+"\t"+Pw);
		
		
	}

}
