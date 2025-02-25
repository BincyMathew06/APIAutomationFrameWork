package api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

// filters used to intercept and get the request and response body

public class LoggingFilter implements Filter{
	
	private static final Logger logger=LogManager.getLogger(LoggingFilter.class);

	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		// TODO Auto-generated method stub
		
		logRequest(requestSpec);
		
		Response response=ctx.next(requestSpec, responseSpec); // request is going to execute
		
		logResponse(response);
		return response;
	}

	
	public void logRequest(FilterableRequestSpecification requestSpec) {
		
		logger.info("Base URI"+requestSpec.getBaseUri());
		
		logger.info("Req Headers"+requestSpec.getHeaders());
		
		logger.info("Request Body"+requestSpec.getBody());
	}
	
	
public void logResponse(Response response) {
		
	logger.info("Response Body"+response.getBody().asPrettyString());
	
	logger.info("Response Headers"+response.getHeaders());
	
	logger.info("Status Code"+response.getStatusCode());
	}
}
