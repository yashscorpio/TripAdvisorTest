package com.xyz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Review {
	public WebDriver driver;
	public Actions act;
	public WebDriverWait wait;
	public WebElement star;

	public Review(WebDriver driver, Actions act, WebDriverWait wait) {
		this.driver = driver;
		this.act = act;
		this.wait = wait;
	}

	public void review1() {
		act.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span#bubble_rating"))), 50, 0).click().build().perform();
	}
	
	public void review2() {
		driver.findElement(By.xpath("//*[@id=\"ReviewTitle\"]")).sendKeys("Bevarsi kudka");
		driver.findElement(By.xpath("//*[@id=\"ReviewText\"]")).sendKeys("Heyy ungammaaa tripadviser");
	}
	
	public void review3() throws InterruptedException {
		act.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#qid12_bubbles"))), 50, 0).click().build().perform();
		act.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#qid14_bubbles"))), 50, 0).click().build().perform();
		act.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#qid190_bubbles"))), 50, 0).click().build().perform();
	}
	
	public void review4() {
		driver.findElement(By.xpath("//*[@id=\"ROOM_TIP\"]")).sendKeys("Tika muchkond manel iri");
		driver.findElement(By.xpath("//input[@id='noFraud']")).click();
	}
	
	public void clickk() {
		driver.findElement(By.xpath("//div[@id='SUBMIT']")).click();
	}
	
}
