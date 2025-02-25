package api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//static import improves readability
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(api.listeners.TestListener.class)

public class LoginAPITest2 {
	
	// RestAssured is a utillity class all the variables and method are static in nature. reusable components
	
	
	@Test(description ="verify if login api is working")
	public void loginTest() {
		// given method return type request specification
		baseURI="https://postman-rest-api-learner.glitch.me/";
		
		// how the request looks like
		

		Response response=given().header("Content-Type","application/json").body("{\"name\": \"Bincy\"}").post("/info");
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(),200);
		
		//Assert.assertEquals(response.getStatusCode(),2112);
		
		
		Response response1=given()
				.baseUri("https://postman-rest-api-learner.glitch.me/")
				.header("Content-Type","application/json")
				.body("{\"name\": \"Dave\"}")
				.post("/info");
		
        System.out.println(response1.asPrettyString());
		
		Assert.assertEquals(response1.getStatusCode(),200);
	}

}
