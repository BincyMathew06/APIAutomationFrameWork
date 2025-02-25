package api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import api.base.ProductService;
import api.model.response.ProductGetResponse;
import api.model.response.ProductResponse;
import io.restassured.response.Response;

@Listeners(api.listeners.TestListener.class)

public class GetProductRequest {
	
	@Test(description="Verify product get request")	
	void GetProductDetails() {
		
ProductService productservice=new ProductService();
		
		Response response=productservice.getProduct();
		
		System.out.println(response.asString());
		
		//ProductResponse productresponse=response.as(ProductResponse.class);
		
		ProductGetResponse productgetresponse=response.as(ProductGetResponse.class);
		
		System.out.println(productgetresponse.getRecords());
		
		System.out.println("First Record "+productgetresponse.getRecords().get(0));
		
		System.out.println("First id is "+productgetresponse.getRecords().get(0).getCategory_id());
		
		Assert.assertEquals(productgetresponse.getRecords().get(0).getCategory_id(), 3);
	}

}
