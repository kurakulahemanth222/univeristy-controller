package Curd_Methods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class PutMethod {
	@Test
public void putmethod() {
		JSONObject object =new JSONObject();
		
		object.put("id","UNI_00102");
		object.put("about","capgemini");
		object.put("addres","hyderbad");
		object.put("email","khemanth222@gmail.com");
		object.put("name","manothra");
		object.put("phone","9000764426");
		
	
		given()
		.contentType(ContentType.JSON)
		.body(object)
		
		.when()
		.post("http://localhost:8080/university")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	
}
	
}

