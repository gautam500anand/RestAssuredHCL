import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class JiraTests {

	@Test
	public void logInToJira()
	{
		RestAssured.baseURI = "http://http://localhost:8080";
		given().header("","").pathParam(DEFAULT_BODY_ROOT_PATH, DEFAULT_AUTH)
		
	}
}
