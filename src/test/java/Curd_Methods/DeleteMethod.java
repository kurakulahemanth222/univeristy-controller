package Curd_Methods;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteMethod {
	@Test
	public void delete() {
		baseURI = "http://localhost:8080/university?id=123";
		when()
		.get("/alluniversity")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
	}

}
