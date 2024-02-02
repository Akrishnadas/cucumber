package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

public WebDriver driver;
	
	@FindBy(xpath = "//p[text()='Men']")
	private WebElement element;

	public WebElement getElement() {
		return element;
	}
	
	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
