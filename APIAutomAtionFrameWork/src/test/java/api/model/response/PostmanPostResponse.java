package api.model.response;
public class PostmanPostResponse {
	
private String message;

private Object data;
	
	public Object getData() {
	return data;
}


	public void setData(Object data) {
	this.data = data;
}


	public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}


//jackson require default constructor


public PostmanPostResponse() {
	
}
	
	public PostmanPostResponse(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}

	
	
	@Override
	public String toString() {
		return "PostmanPostResponse [message=" + message + ", data=" + data + "]";
	}



}
