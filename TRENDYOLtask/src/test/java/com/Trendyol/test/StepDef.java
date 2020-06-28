package com.Trendyol.test;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	
	@When("^login trendyol$")
	public void login_trendyol()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		   driver.get("https://www.trendyol.com/");
	   driver.findElement(By.className("fancybox-item fancybox-close")).click();       

	}

	@When("^ensure$")
	public void ensure()  {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("trendyol", title);
	driver.findElement(By.className("account-button login")).click();
	driver.findElement(By.id("email")).sendKeys("gkhnozhn@hotmail.com");
	driver.findElement(By.id("password")).sendKeys("2402Gokhan");
	
	}

	@When("^write bilgisayar in search$")
	public void write_bilgisayar_in_search() {
	    driver.findElement(By.className("search-box")).clear();
	    driver.findElement(By.className("search-box")).sendKeys("bilgisayar");
	    driver.findElement(By.className("search-box")).click();
	}

	@Then("^pick random one$")
	public void pick_random_one()  {
	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/a/div[1]/div/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[5]/button[1]/div[1]")).click();
	  
	}

	@Then("^add to cart$")
	public void add_to_cart() {
	   driver.findElement(By.className("goBasket")).click();
	}

	@Then("^compare prices$")
	public void compare_prices()  {
	 WebElement listP = driver.findElement(By.className("prc-box-sllng"));
	 WebElement cartP = driver.findElement(By.className("pb-basket-item-price"));
		System.out.println(cartP.equals(listP));
	}

	@Then("^Add more$")
	public void add_more()  {
	 driver.findElement(By.className("ty-numeric-counter-button")).click();
	}

	@Then("^empty cart$")
	public void empty_cart() {
	  WebElement dlt = driver.findElement(By.xpath("//*[@id=\"partial-basket\"]/div/div[2]/div[2]/div[3]/button/i"));
	  dlt.click();
	   Asserts.notNull(dlt, null);
	}

	@Then("^Close$")
	public void close()  {
	  driver.quit();
	}

}
