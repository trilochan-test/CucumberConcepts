package AppStepDefinitions;

import AppImplementation.Product;
import AppImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1: I am on search page");

	}

	@When("^I Search for a product name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with name :" + productName + "and  Price : " + price);
		product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: product " + productName + " is displayed");
		/*
		 * search = new Search(); String displayProductName =
		 * search.displayProduct(product); Assert.assertEquals(product.getProductName(),
		 * displayProductName);
		 */

	}
}
