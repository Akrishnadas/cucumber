package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Kids {

public WebDriver driver;
	
	@FindBy(id = "kids_category")
	private WebElement kids;

	public Select_Kids(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='dresses & frocks'])[1]")
	private WebElement dress_Frocks;
	
	@FindBy(xpath = "(//img[@alt='Product image'])[1]")
	private WebElement select_item;
	
	@FindBy(xpath = "//span[text()=' 3-4 Y ']")
	private WebElement select_size;
	
	@FindBy(xpath = "//div[text()='ADD TO CART']")
	private WebElement addToCart;
	
	public WebElement getDress_Frocks() {
		return dress_Frocks;
	}

	public WebElement getSelect_item() {
		return select_item;
	}


	public WebElement getSelect_size() {
		return select_size;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getKids() {
		return kids;
	}
}
