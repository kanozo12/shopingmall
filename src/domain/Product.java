package domain;

public class Product {
	private int productId;
	private String productType;
	private String productName;
	private String explanation;
	private int price;
	private int inventory;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public Product(int productId, String productType, String productName, String explanation, int price,
			int inventory) {
		super();
		this.productId = productId;
		this.productType = productType;
		this.productName = productName;
		this.explanation = explanation;
		this.price = price;
		this.inventory = inventory;
	}

	public Product() {

	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productType=" + productType + ", productName=" + productName
				+ ", explanation=" + explanation + ", price=" + price + ", inventory=" + inventory + "]";
	}

}
