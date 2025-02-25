package api.base;

import api.filters.LoggingFilter;
import api.model.request.PostmanPostRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	// Base uri
	
	//creating the request
	
	//handling the response
	
	//wrapper for rest assured
		
	//Design pattern Service Object Design Pattern
	
	
	
	private static final String BASE_URL1="https://postman-rest-api-learner.glitch.me/";
	
	private static final String BASE_URL2="http://localhost:8888/api_testing";
	
	
	
	private RequestSpecification requestspecification;
	
	static{
		
		RestAssured.filters(new LoggingFilter());
	}
	
	//Constructor
	//initilize instance variables
	
	public BaseService() {
		
		requestspecification=RestAssured.given().baseUri(BASE_URL2);
		   
	}
	
	//polymorphism  change it to Object
	
	
	
	//public Response postRequest(PostmanPostRequest payload,String endpoint) {
		
		public Response postRequest(Object payload,String endpoint) {
		
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
		
		//overloading
		
		public Response postRequest(String baseUri, Object payload,String endpoint) {
			
			return requestspecification.baseUri(baseUri).contentType(ContentType.JSON).body(payload).post(endpoint);
		}
	
	
		
		public Response getRequest(String endpoint) {
			return requestspecification.get(endpoint);
			
		}
		
		// to set token
		
		protected void setAuthToken(String token) {
			
			requestspecification.header("Authorization","Bearer "+token);
		}
		
		public Response deleteRequest(Object payload,String endpoint) {
			
			return requestspecification.contentType(ContentType.JSON).body(payload).delete(endpoint);
		}

}
