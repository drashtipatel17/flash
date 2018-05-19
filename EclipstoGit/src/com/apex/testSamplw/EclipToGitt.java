package com.apex.testSamplw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EclipToGitt {

	public static void main(String[] args) {
			
		System.out.println("Radha Swami");
		System.setProperty("webdriver.gecko.driver","C:\\Gecodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		   
		driver.get("https://www.facebook.com/");
		
	}

}
