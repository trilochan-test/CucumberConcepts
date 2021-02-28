package AppStepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	@Given("User is on Registration Page")
	public void user_is_on_registration_page() {
		System.out.println("User is on Registration Page");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		List<List<String>> userData = dataTable.asLists(String.class);

		for (List<String> data : userData) {
			System.out.println(data);
		}

	}

	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
		List<Map<String, String>> userData = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> m : userData) {
			System.out.println(m.get("FirstName"));
			System.out.println(m.get("LastName"));
			System.out.println(m.get("EmailID"));
			System.out.println(m.get("PhoneNumber"));
			System.out.println(m.get("City"));

		}

	}

	@Then("User Registration should be sucessful")
	public void user_registration_should_be_sucessful() {
		System.out.println("User Registration should be sucessful");

	}

}
