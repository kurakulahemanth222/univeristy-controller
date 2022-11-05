package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteCucumberUniversity {
	Response response;
	  ValidatableResponse val;
	
	
	@When("user is able to delete the data by using an url is {string}")
	public void user_is_able_to_delete_the_data_by_using_an_url_is(String url) {
		 response = RestAssured.get(url);
	}
	@Then("user will validate the statusCode of the delete the id {int}")
	public void user_will_validate_the_status_code_of_the_delete_the_id(Integer int1) {
		val = response.then(); 
		val.assertThat().statusCode(int1).log().all();
	}
}
