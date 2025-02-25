package api.model.response;

public class ProductResponse {
	

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ProductResponse(String message) {
		super();
		this.message = message;
	}
	public ProductResponse() {
		
	}

	@Override
	public String toString() {
		return "ProductResponse [message=" + message + "]";
	}
}
