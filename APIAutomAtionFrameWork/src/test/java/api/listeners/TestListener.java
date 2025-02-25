package api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	private static final Logger logger=LogManager.getLogger(TestListener.class);
	
	public  void onStart(ITestContext context) {
	    logger.info("Test suite started");
	  }
	
	 public  void onTestStart(ITestResult result) {
		    logger.info("Test  started");
		  }
	
	 public void onTestSuccess(ITestResult result) {
		    logger.info("Passed "+result.getMethod().getMethodName());
		    
		    logger.info("description "+result.getMethod().getDescription());
		  }

	public void onTestFailure(ITestResult result) {
		logger.error("failed "+result.getMethod().getMethodName());
	    
	    logger.error("description "+result.getMethod().getDescription());
		  }

	public void onTestSkipped(ITestResult result) {
		logger.info("skipped "+result.getMethod().getMethodName());
		  }
	
	 
	  public void onFinish(ITestContext context) {
		  logger.info("Test suite started");
	  }

}
