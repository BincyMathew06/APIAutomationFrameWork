package api.model.response;

import java.util.List;

public class ProductGetResponse {
	
	private List<ProductRecord> records;
	
	 @Override
	public String toString() {
		return "ProductGetResponse [records=" + records + "]";
	}

	public ProductGetResponse(List<ProductRecord> records) {
		super();
		this.records = records;
	}

	public ProductGetResponse() {
		
	}

	public List<ProductRecord> getRecords() {
		return records;
	}

	public void setRecords(List<ProductRecord> records) {
		this.records = records;
	}
}
