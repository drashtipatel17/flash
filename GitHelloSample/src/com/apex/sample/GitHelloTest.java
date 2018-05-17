package com.apex.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHelloTest{
public static void main (String[] args){

	
		System.setProperty("webdriver.gecko.driver","C:\\Gecodriver\\geckodriver.exe");
		
		//System.setProperty(arg0, arg1)

		WebDriver driver = new FirefoxDriver();
		   
		driver.get("https://www.facebook.com/");
}
}
