package api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(api.listeners.TestListener.class)

public class LoginAPITest {
	
	// RestAssured is a utillity class all the variables and method are static in nature. reusable components
	
	
	@Test(description ="verify if login api is working")
	public void loginTest() {
		// given method return type request specification
		RestAssured.baseURI="https://postman-rest-api-learner.glitch.me/";
		
		// how the request looks like
		RequestSpecification x=RestAssured.given();
		
		RequestSpecification y=x.header("Content-Type","application/json");

		RequestSpecification z=y.body("{\"name\": \"Bincy\"}");
		
		Response response=z.post("/info");
		
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(),200);
		
		//Assert.assertEquals(response.getStatusCode(),2112);
	}

}
