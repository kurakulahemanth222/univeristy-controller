package stepdefinition;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutCucucmberUniversity {
	 RequestSpecification req;
	 Response res;
	 ValidatableResponse validate ;
	
	@Given("as a user i want to put the data in data base")
	public void as_a_user_i_want_to_put_the_data_in_data_base() {
	   JSONObject obj = new JSONObject();
	    obj.put("id","UNI_00102");
		obj.put("about","capgemini");
		obj.put("addres","hyderbad");
		obj.put("email","khemanth222@gmail.com");
		obj.put("name","manothra");
		obj.put("phone","9000764426");
		req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
	}

	@When("as a user gives the data by using url {string}")
	public void as_a_user_gives_the_data_by_using_url(String url) {
	  res = req.post(url);
	}

	@Then("as a user validates that status code is {int}")
	public void as_a_user_validates_that_status_code_is(Integer int1) {
	    validate = res.then();
	    validate.assertThat().statusCode(int1).log().all();
	}




}
