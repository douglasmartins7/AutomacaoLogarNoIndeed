package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingStrategies {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		// Open indeed home page
		driver.get("http://www.indeed.co.uk/");

		// Find what field and enter Seleniun
		// driver.findElement(By.id("what")).sendKeys("selenium");

		// Locating by Name
		//driver.findElement(By.name("q")).sendKeys("Selenium");

		// Locating by linkText
		// driver.findElement(By.linkText("Upload your CV")).click();

		// driver.findElement(By.partialLinkText("Post Job")).click();

		
		/*
		// Locating by Xpath
		System.out.println(

				driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src"));

		// System.out.println(driver.findElement(By.id("searchCount")).getText());
		
		
		*/
		
		//Locating by selector
		
		
		/*
		System.out.println(driver.findElement(By.cssSelector("input.input_submit"))
				.getAttribute("value")
		
		);
		
		*/
		
		
		System.out.println(
				
				driver.findElements(By.tagName("a")).size()
		
		);
		
		/*	
		System.out.println(
				
				driver.findElement(By.tagName("a"))
				.getText()
		
		);
		*/
		
		
		/*
		System.out.println(
				
				driver.findElements(By.className("input_text")).size()
		
		);
		
		
				
				driver.findElement(By.className("input_text")).sendKeys("Selenium");
		*/
		
		
		/*
		System.out.println(driver.findElement(By.linkText("Find CVs")));
		*/

	}

}
