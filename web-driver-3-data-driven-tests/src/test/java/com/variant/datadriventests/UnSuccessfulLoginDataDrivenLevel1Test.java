package com.variant.datadriventests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnSuccessfulLoginDataDrivenLevel1Test {
		
	//Create the Data Provider and give the data provider a name
	@DataProvider(name="user-ids-passwords-data-provider")
	public Object[] userIdsAndPasswordsDataProvider() {
		return new String[][]{
				{"in28minutes","in28minutes"},
				{"adam","adam"},
				{"eve","eve"},
			};
	}	
	
	//Use the data provider
	@Test(dataProvider="user-ids-passwords-data-provider")
	public void testUnsuccessfulLoginWithIn28Minutes(String userId, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.findElement(By.id("name")).sendKeys(userId);
		//driver.findElement(By.id("name")).sendKeys("in28minutes");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys(password);
		passwordElement.submit();
		// driver.findElement(By.id("submit")).click();

		// welcome-message
		String errorMessageText = driver.findElement(By.id("error-message")).getText();
		System.out.println(errorMessageText);
		assertEquals(errorMessageText,"Invalid Credentials");
		driver.quit();
	}
}
