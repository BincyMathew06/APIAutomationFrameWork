package api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import api.base.ProductService;
import api.model.request.ProductRequest;
import api.model.response.ProductResponse;
import io.restassured.response.Response;

@Listeners(api.listeners.TestListener.class)

public class DeleteProductTests {
	
	@Test(description="Verify product delete request")
	public void createProductTest() {
		
		//static inner class Builder 
		
		ProductRequest productrequest=
				new ProductRequest.Builder()
				.id(1004)
				.name("Shoe")
				.price(45.67)
				.description("Men Shoes")
				.category_id(3)
				.build();
		
		ProductService productservice=new ProductService();
		
		Response response=productservice.delete(productrequest);
		
		System.out.println(response.asString());
		
		ProductResponse productresponse=response.as(ProductResponse.class);
		
		Assert.assertEquals(productresponse.getMessage(), "Product was deleted.");
		
		Assert.assertEquals(response.getStatusCode(),200);
		
	}

}
