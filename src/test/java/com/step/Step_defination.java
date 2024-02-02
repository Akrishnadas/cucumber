package com.step;

import com.Base.Bass_class;
import com.poma.pageObjectManager;

//import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step_defination extends Bass_class{

	pageObjectManager pom = new pageObjectManager();
	
//	@After
//	public static void closeBrowser() {
//		closeBrowser();
//	}

	@Given("User enter url {string}")
	public void user_enter_url(String u) {
	    launchUrl(u);
	}
	@When("User click men or woman")
	public void user_click_men_or_woman() throws InterruptedException {
	    Thread.sleep(3000); 
		clickButton(pom.getHp().getElement());  
	}

	@And("mouse over to kids")
	public void mouse_over_to_kids() throws InterruptedException {
		Thread.sleep(3000);
	    mouseHover(pom.getsk().getKids());
	}
	@And("click on dress and frocks")
	public void click_on_dress_and_frocks() throws InterruptedException {
		Thread.sleep(5000);
	    clickButton(pom.getsk().getDress_Frocks());
	}
	@And("click on 1st dress")
	public void click_on_1st_dress() throws InterruptedException {
		Thread.sleep(3000);
	    clickButton(pom.getsk().getSelect_item());
	}
	@And("select the size")
	public void select_the_size() throws InterruptedException {
		Thread.sleep(3000);
	    clickButton(pom.getsk().getSelect_size());
	}
	@And("click add to cart")
	public void click_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
	   clickButton(pom.getsk().getAddToCart());
	}

}
