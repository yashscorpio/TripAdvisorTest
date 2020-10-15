package com.xyz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
public WebDriver driver;
public WebElement select;

public Search(WebDriver driver) {
	this.driver = driver;
}

public void url() {
	driver.get("https://www.tripadvisor.in/");
}

public void enter() {
	driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Club Mahindra ");
}

public void click() {
	select = driver.findElement(By.xpath("//a[@class='_1dvyiAq4']/../a[1]"));
	select.click();
}
}
