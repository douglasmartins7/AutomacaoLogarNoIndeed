package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IndeedJobSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Douglas Martins\\Downloads\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		// Create firefox driver to drive the browser
		// WebDriver driver = new FirefoxDriver();

		// Open indeed home page
		driver.get("http://www.indeed.co.uk/");

		// Find what field and enter Seleniun
		driver.findElement(By.id("what")).sendKeys("selenium");

		// Find location field and enter Brazil

		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("London");

		// Find findJobs button and click on it
		driver.findElement(By.id("fj")).click();

		// From job search result page, get page title and jobs count message
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());

		driver.close();
	}

}
