package api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import api.base.ProductService;
import api.model.request.ProductRequest;
import api.model.response.ProductResponse;
import io.restassured.response.Response;

@Listeners(api.listeners.TestListener.class)

public class CreateProductTests {
	
	@Test(description="Verify product create request")
	public void createProductTest() {
		
		//static inner class Builder 
		
		ProductRequest productrequest=
				new ProductRequest.Builder()
				.id(1001)
				.name("Shoe")
				.price(45.67)
				.description("Women Shoes")
				.category_id(3)
				.build();
		
		ProductService productservice=new ProductService();
		
		Response response=productservice.create(productrequest);
		
		System.out.println(response.asString());
		
		ProductResponse productresponse=response.as(ProductResponse.class);
		
		Assert.assertEquals(productresponse.getMessage(), "Product was created.");
		
		Assert.assertEquals(response.getStatusCode(),201);
		
	}

}
