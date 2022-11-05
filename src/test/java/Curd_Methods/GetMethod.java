package Curd_Methods;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetMethod {
@Test
	public void getmethod() {
	baseURI = "http://localhost:8080";
	when()
	.get("/alluniversity")
	
	.then()
	.assertThat().statusCode(200)
	.log().all();
	}
}
