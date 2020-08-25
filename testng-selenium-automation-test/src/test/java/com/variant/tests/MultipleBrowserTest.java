package com.variant.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
  
	@Parameters("browser")
	@Test
	public void runInBrowser(String browser) {
		System.out.println(browser);
	}
}
