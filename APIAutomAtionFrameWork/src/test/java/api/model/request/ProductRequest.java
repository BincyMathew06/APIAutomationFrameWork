package api.model.request;

public class ProductRequest {
	

	private int id;
	private String name;
    private String description;
    private double price;
    private int category_id;
   
	// make the constructor private
	private ProductRequest(int id, String name, String description, double price, int category_id
			) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category_id = category_id;
	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	
	@Override
	public String toString() {
		return "ProductRequest [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", category_id=" + category_id +  "]";
	}
	
	//Builder design pattern so that we can pass params in any order
	//inner class
	
	public static class Builder{
		
		private int id;
		private String name;
	    private String description;
	    private double price;
	    private int category_id;
	    
	    
	    public Builder id(int id){
	    	
	    	this.id=id;
	    	
	    	//Builder x=new Builder();
	    	
	    	Builder x=this;
	    	
	    	return x;
	    	
	    }
	    
	    
 public Builder name(String name){
	    	
	    	this.name=name;
	    	
	    	//Builder x=new Builder();
	    	
	    	//Builder x=this;
	    	
	    	return this;
	    	
	    }
 
 public Builder description(String description){
 	
 	this.description=description;
 	
 	//Builder x=new Builder();
 	
 	//Builder x=this;
 	
 	return this;
 	
 }
 
 
 public Builder price(double price){
 	
 	this.price=price;
 	

 	return this;
 	
 }
 
 
 public Builder category_id(int category_id){
 	
 	this.category_id=category_id;
 	

 	return this;
 	
 }
 
 

 //build method
 
public ProductRequest build() {
	
	ProductRequest productrequest=new ProductRequest(id,name,description,price, category_id);
	return productrequest;
}
 
	
	    }

}
