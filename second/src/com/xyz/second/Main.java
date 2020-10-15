package com.xyz.second;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.pages.Hotel;
import com.xyz.pages.Review;
import com.xyz.pages.Search;

public class Main {
   public WebDriver driver;
   public Search search;
   public Hotel hotel;
   public Review review;
   public Actions act;
   public WebDriverWait wait;
   public JavascriptExecutor je;
   public String window;
	
	
	  @Test 
	  public void search() throws InterruptedException
	  {
		  
		  search = new Search(driver);
		  search.url(); 
		  search.enter(); 
		  Thread.sleep(5000);
		  search.click();
		  
		  System.out.println("the current window is "+window);
		  
		  hotel = new Hotel(driver,act,wait,je);
		  hotel.button();
		  
		  Thread.sleep(5000);
		  
		  System.out.println(driver.getTitle());
		  
		  for (String childTab : driver.getWindowHandles()) {
			  driver.switchTo().window(childTab);	
		  	}
		  
		  Thread.sleep(3000);
		  
		  System.out.println(driver.getTitle());
		  
		  review = new Review(driver,act,wait);
		  review.review1();
		  Thread.sleep(2000);
		  review.review2();
		  Thread.sleep(2000);
		  review.review3();
		  Thread.sleep(2000);
		  review.review4();
		  Thread.sleep(2000);
		  review.clickk();
	  }
	 

	
	
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Automation\\class\\seleniumComponents\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 30);
		je =(JavascriptExecutor) driver;
		window = driver.getWindowHandle();
	}
	
	
	
	
	  @AfterMethod
	  public void quit() {
	  driver.quit(); 
		  }
	 
	 
}
