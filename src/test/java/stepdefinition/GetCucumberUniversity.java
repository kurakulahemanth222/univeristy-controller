package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetCucumberUniversity {
	Response response;
	ValidatableResponse validate;
	@When("user is able to retrive the data by using api {string}")
	public void user_is_able_to_retrive_the_data_by_using_api(String url) {
		 response = RestAssured.get(url);
	}

	@Then("user validate that status code is {int}")
	public void user_validate_that_status_code_is(Integer int1) {
		 validate = response.then();
	     validate.assertThat()
	     .statusCode(int1).log().all();
	}


}
