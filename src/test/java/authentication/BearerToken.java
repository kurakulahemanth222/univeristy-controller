package authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class BearerToken {
	
	@Test
	public void bearerToken() {
		
		
		
		baseURI="https://api.github.com";
		
		JSONObject obj=new JSONObject();
		
		obj.put("name", "BasicAuth");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		
	}

}
