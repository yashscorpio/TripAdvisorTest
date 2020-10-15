package com.xyz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hotel {
	public WebDriver driver;
	public Actions act;
	public WebDriverWait wait;
	public JavascriptExecutor je;
	public WebElement button;

	public Hotel(WebDriver driver, Actions act, WebDriverWait wait, JavascriptExecutor je) {
		this.driver = driver;
		this.act = act;
		this.wait = wait;
		this.je = je;
	}

	
	public void button() throws InterruptedException {
		button = driver.findElement(By.xpath("(//h2[@class='_11J3kRI9'])[3]/../div[2]/div/div[1]/a"));
		je.executeScript("arguments[0].scrollIntoView()",button );
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h2[@class='_11J3kRI9'])[3]/../div[2]/div/div[1]/a"))).click();
	}
	
	
}
