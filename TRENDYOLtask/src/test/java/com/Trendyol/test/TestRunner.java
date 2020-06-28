package com.Trendyol.test;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;

import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Trendyol/Trendyol.feature")
public class TestRunner {
WebDriver driver;
	
	@Given("^Open Trendyol$")
	public void Open_Trendyol() {
		
}
}