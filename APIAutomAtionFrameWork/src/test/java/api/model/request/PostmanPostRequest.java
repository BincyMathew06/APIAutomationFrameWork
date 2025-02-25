package api.model.request;

public class PostmanPostRequest {
	
	private String name;
	

	public PostmanPostRequest(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "PostmanPostRequest [name=" + name + "]";
	}
	
	
}
