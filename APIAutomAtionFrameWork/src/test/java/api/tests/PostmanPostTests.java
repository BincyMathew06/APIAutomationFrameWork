package api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import api.base.PostmanPostService;
import api.model.request.PostmanPostRequest;
import api.model.response.PostmanPostResponse;
import io.restassured.response.Response;

@Listeners(api.listeners.TestListener.class)

public class PostmanPostTests {
	
	@Test(description ="verify if post api is working")
	public void postmanpost() {
		
		PostmanPostRequest prequest=new PostmanPostRequest("Bincy");
		
		PostmanPostService pservice=new PostmanPostService();
		
		//Response response=pservice.create("{\"name\": \"Bincy\"}");
		
		Response response=pservice.create(prequest);
		
		System.out.println(response.asPrettyString());
		
		// response.as  calling jackson utility
		//convert json to object of the class
		
		PostmanPostResponse presponse=response.as(PostmanPostResponse.class);
		
		System.out.println(presponse.getData());
		
		System.out.println(presponse.getMessage());
		
		Assert.assertEquals(presponse.getMessage(), "You made a POST request with the following data!");
		
		
	}

}
