package api.base;

import api.model.request.ProductRequest;
import io.restassured.response.Response;

public class ProductService extends BaseService{
	
	private static final String BASE_PATH="/product";
	
    public Response create(ProductRequest payload) 

    {	
	   return postRequest(payload,BASE_PATH+"/create.php");
	}
	

    public Response update(ProductRequest payload)
    {
	   return postRequest(payload,BASE_PATH+"/update.php");
	}
	
    
    public Response getProduct()
    {
	   return getRequest(BASE_PATH+"/read.php");
	}

// with token if needed
    
    public Response getProduct(String token)
    {
    	setAuthToken(token);
	   return getRequest(BASE_PATH+"/read.php");
	}

	
    public Response delete(ProductRequest payload)
    {
	   return deleteRequest(payload,BASE_PATH+"/delete.php");
	}
}
