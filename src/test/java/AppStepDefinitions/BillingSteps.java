package AppStepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingSteps {

	double billingAmount;
	double taxAmount;
	double finalAmount;

	@Given("User is on billing page")
	public void user_is_on_billing_page() {

	}

	@When("User enters Billing Amount {string}")
	public void user_enters_billing_amount(String billingAmount) {
		this.billingAmount = Double.parseDouble(billingAmount);

	}

	@When("User enters Tax Amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
		this.taxAmount = Double.parseDouble(taxAmount);

	}

	@When("User Clicks on Calculate button")
	public void user_clicks_on_calculate_button() {

	}

	@Then("It gives the Final Amount {string}")
	public void it_gives_the_final_amount(String expectedFinalAmount) {
		this.finalAmount = this.billingAmount + this.taxAmount;
		System.out.println("Expected Final Amount : " + Double.parseDouble(expectedFinalAmount));
		System.out.println("Actual Final Amount : " + this.finalAmount);

		Assert.assertTrue(this.finalAmount == Double.parseDouble(expectedFinalAmount));

	}

}
