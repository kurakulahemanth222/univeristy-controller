package Curd_Methods;

import org.json.simple.JSONObject;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
public class PostMethod {
@Test
	
	public void postMethod1() {
		JSONObject object = new JSONObject();
		
		//object.put("id", "UNI_00104");
		object.put("about", "infosys");
		object.put("address", "whitefield");
		object.put("email", "sagar@gmail.com");
		object.put("name", "sagar");
		object.put("phone", "9666330289");
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		
		.when()
		.post("http://localhost:8080/university")
		
		.then()
		.assertThat().statusCode(200).body("data.email",equalTo("sagar@gmail.com"))
		.log().all();
	}
}
