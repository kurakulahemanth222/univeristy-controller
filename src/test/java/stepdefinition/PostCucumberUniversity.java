package stepdefinition;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;
import io.restassured.specification.RequestSpecification;

public class PostCucumberUniversity {
	  RequestSpecification req ;
	  ValidatableResponse validate;
	  Response res;
	  
	  
	@Given("user is able to provide the data in database")
	public void user_is_able_to_provide_the_data_in_database() {
		  JSONObject obj = new JSONObject(); 
		    obj.put("about", "infosys");
			obj.put("address", "whitefield");
			obj.put("email", "sagar@gmail.com");
			obj.put("name", "sagar");
			obj.put("phone", "9666330289");
	        req  = RestAssured.given();
	        req.body(obj);
	        req.contentType(ContentType.JSON);
	}

	@When("user gives the data by using url {string}")
	public void user_gives_the_data_by_using_url(String url) {
		res = req.post(url);
	    
	}

	@Then("user validates that status code is {int}")
	public void user_validates_that_status_code_is(Integer int1) {
		 validate = res.then();
		 validate.assertThat().statusCode(int1).log().all();
	    
	}



}
