package com.variant.datadriventests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuccessfulLoginBasicTest {

	@Test
	public void testLoginWithVariant() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.findElement(By.id("name")).sendKeys("variant");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("dummy");
		passwordElement.submit();
		// driver.findElement(By.id("submit")).click();

		// welcome-message
		System.out.println(driver.findElement(By.id("welcome-message")).getText());
		driver.quit();
	}
}
