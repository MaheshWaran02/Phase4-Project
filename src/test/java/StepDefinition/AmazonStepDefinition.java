package StepDefinition;



import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import PageObjectModel.LoginPage;
import PageObjectModel.SearchProduct;


import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinition {

	AndroidDriver driver = Hooks.driver;
	LoginPage Loginpage  = new LoginPage(driver);
	SearchProduct SearchPage = new SearchProduct (driver);
	
	
	@Given("I login to amazon application")
	public void i_login_to_amazon_application() {
	    // Write code here that turns the phrase above into concrete actions
		Loginpage.languagebutton(driver);
	}

	@Given("I search for the product {string}")
	public void i_search_for_the_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
		SearchPage.clickSearch(driver, string);
	}

	@Given("choose the product {string}")
	public void choose_the_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
		SearchPage.Searchproducts(driver);
	}

	@When("I complete Add To Cart")
	public void i_complete_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		SearchPage.addproducttoCart(driver);
	}

	@Then("the product is added to the Cart")
	public void the_product_is_added_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
