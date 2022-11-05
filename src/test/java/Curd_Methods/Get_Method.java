package Curd_Methods;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Get_Method {
	@Test
public void getmethod1() {
	baseURI = "http://localhost:8080";
	when()
	.get("/alluniversity")
	
	.then()
	.assertThat().statusCode(200)
	.log().all();
}
}
