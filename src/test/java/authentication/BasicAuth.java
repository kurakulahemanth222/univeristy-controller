package authentication;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



import org.json.simple.JSONObject;

public class BasicAuth {
	@Test
	 public void basic() {
		 baseURI = "http://api.github.com";
		 //JSONObject obj = new JSONObject();
		 given().auth().basic("kurakulahemanth222@gmail.com","Kurakula@02");
		 when().get("/user/repos").then().log().all();
	 }

	
	}

