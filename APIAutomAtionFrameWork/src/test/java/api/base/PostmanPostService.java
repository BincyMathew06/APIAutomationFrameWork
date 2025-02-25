package api.base;

import api.model.request.PostmanPostRequest;
import io.restassured.response.Response;

//service object model



public class PostmanPostService extends BaseService{
	
	private static final String BASEPATH="";
	
public Response create(PostmanPostRequest payload) {
		
		return postRequest(payload,BASEPATH+"/info");
	}

}
